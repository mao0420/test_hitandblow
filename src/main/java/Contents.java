import org.springframework.stereotype.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.*;

@Controller
public class Contents extends JFrame implements ActionListener {
    JPanel cardPanel;
    CardLayout layout;

    //試行回数のカウンタ―を初期化
    static int tryTimes = Constants.CONSTANT_TRY_TIMES_COUNT_FORMAT;
    //正解の数字を初期化
    static int[] answer = new int[Constants.CONSTANT_DIGIT_NUMBER];
    //ユーザ名を初期化
    static String userName = "NoName";
    //ゲーム開始時間を初期化
    static Date startDate = new Date();
    //ゲーム終了時間を初期化
    static Date endDate = new Date();

    /**
     * メインメソッド
     * 基本となるメソッド、画面やパネルの初期設定を実施する。
     *
     * @param args メインメソッド実行用の引数
     */
    public static void main(String[] args) {
        //フレームの定義
        Contents frame = new Contents();
        //フレームのタイトルを設定
        frame.setTitle(Constants.DISPLAY_NAME_FRAME_TITLE);
        //ウインドウサイズを設定
        frame.setSize(Constants.SIZE_FRAME_WIDTH, Constants.SIZE_FRAME_HEIGHT);
        //ウインドウをモニタの中央に表示
        frame.setLocationRelativeTo(null);
        //閉じるボタンで終了時にプログラムを終了
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //フレームの表示
        frame.setVisible(true);
    }

    /**
     * コンテンツコンストラクタ
     * 各画面のパネルを初期設定する。
     */
    public Contents() {
        //タイトル画面カード
        TitleScreenPanel cardTitleScreen = new TitleScreenPanel(this);
        Container contentPane01 = getContentPane();
        contentPane01.add(cardTitleScreen, BorderLayout.CENTER);

        //ゲーム画面カード
        GameScreenPanel cardGameScreen = new GameScreenPanel(this);
        Container contentPane02 = getContentPane();
        contentPane02.add(cardGameScreen, BorderLayout.CENTER);

        //ルール説明画面カード
        RuleDescriptionPanel cardRuleDescription = new RuleDescriptionPanel(this);
        Container contentPane03 = getContentPane();
        contentPane03.add(cardRuleDescription, BorderLayout.CENTER);

        //ゲームクリア画面カード
        GameClearPanel cardGameClear = new GameClearPanel(this);
        Container contentPane04 = getContentPane();
        contentPane04.add(cardGameClear, BorderLayout.CENTER);

        //ゲームオーバー画面カード
        GameOverPanel cardGameOver = new GameOverPanel(this);
        Container contentPane05 = getContentPane();
        contentPane05.add(cardGameOver, BorderLayout.CENTER);

        //ユーザ名入力画面カード
        NameEntryPanel cardNameEntry = new NameEntryPanel(this);
        Container contentPane06 = getContentPane();
        contentPane06.add(cardNameEntry, BorderLayout.CENTER);

        //ランキング画面カード
        RankingPanel cardRanking = new RankingPanel(this);
        Container contentPane07 = getContentPane();
        contentPane07.add(cardRanking, BorderLayout.CENTER);

        //カード設定
        cardPanel = new JPanel();
        layout = new CardLayout();
        cardPanel.setLayout(layout);

        //カードを追加
        cardPanel.add(cardTitleScreen, Constants.CARD_TITLE_SCREEN);
        cardPanel.add(cardGameScreen, Constants.CARD_GAME_SCREEN);
        cardPanel.add(cardRuleDescription, Constants.CARD_RULE_DESCRIPTION);
        cardPanel.add(cardGameClear, Constants.CARD_GAME_CLEAR);
        cardPanel.add(cardGameOver, Constants.CARD_GAME_OVER);
        cardPanel.add(cardNameEntry, Constants.CARD_NAME_ENTRY);
        cardPanel.add(cardRanking, Constants.CARD_RANKING);

        //カードを表示
        getContentPane().add(cardPanel, BorderLayout.CENTER);
    }

    /**
     * ボタン入力判定
     * ボタン押下時、ボタンに設定された名前を取得し、それぞれの対応を実行する。
     *
     * @param e 入力されたボタンの名前
     */
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (Constants.CARD_GAME_SCREEN.equals(cmd)) {
            //ゲーム開始ボタンクリック時
            layout.show(cardPanel, cmd);
            //正解設定メソッドへ
            answer = correctAnswerNumber();
            tryTimes = Constants.CONSTANT_TRY_TIMES_COUNT_FORMAT;
            String setTryTimes = String.format(Constants.DISPLAY_TEXT_INPUT_TIMES, tryTimes);
            GameScreenPanel.labelInputTimes.setText(setTryTimes);
            //入力内容初期化メソッドへ
            inputDigitsInitializing();
            //入力履歴初期化メソッドへ
            inputHistoryNumberInitializing();
            startDate = new Date();
            GameScreenPanel.labelErrorMessage.setText(Constants.DISPLAY_TEXT_INPUT_SPACE);
        } else if (Constants.CARD_GAME_OVER.matches(cmd)) {
            //ギブアップボタンクリック時
            layout.show(cardPanel, Constants.CARD_GAME_OVER);
            String setGameOverResult = String.format(Constants.DISPLAY_TEXT_GAME_OVER_RESULT, Arrays.toString(answer));
            GameOverPanel.labelResult.setText(setGameOverResult);
        } else if (Constants.CARD_NAME_ENTRY.matches(cmd)) {
            //名前変更ボタンクリック時
            layout.show(cardPanel, Constants.CARD_NAME_ENTRY);
            String setNameEntry = String.format(Constants.DISPLAY_TEXT_NAME_ENTRY, userName);
            NameEntryPanel.labelNameEntry.setText(setNameEntry);
        } else if (Constants.CARD_RANKING.matches(cmd)) {
//            final JdbcTemplate jdbcTemplate;
//
//            String sqlText = "SELECT ID,USER_NAME,TRY_TIMES,START_DATE,END_DATE FROM RECORD_DATA";
//
//            List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sqlText);
//            List<Data> dataList = new ArrayList<>();
//
//            for (Map<String, Object> result : resultList) {
//                Data data = new Data();
//                data.setDataId((String) result.get("ID"));
//                data.setDataName((String) result.get("USER_NAME"));
//                data.setDataTimes((String) result.get("TRY_TIMES"));
//                data.setDataStart((String) result.get("START_DATE"));
//                data.setDataEnd((String) result.get("END_DATE"));
//                dataList.add(data);
//            }
            layout.show(cardPanel, Constants.CARD_RANKING);
//            MainController controller = new MainController(new DataRepository(new JdbcTemplate()));
            MainController controller = new MainController();

            List<DataDto> setRankingList = controller.write1();
            RankingPanel.labelRanking.setText(String.valueOf(setRankingList));
        } else if (cmd.matches("^Card.*")) {
            //その他画面遷移用ボタンクリック時
            layout.show(cardPanel, cmd);
        } else if (cmd.matches("[0-9]")) {
            //ゲーム画面にて0～9ボタンクリック時
            if (!(GameScreenPanel.labelOneDigits.getText().matches("[0-9]"))) {
                GameScreenPanel.labelOneDigits.setText(cmd);
            } else if (!(GameScreenPanel.labelTwoDigits.getText().matches("[0-9]"))) {
                GameScreenPanel.labelTwoDigits.setText(cmd);
            } else {
                GameScreenPanel.labelThreeDigits.setText(cmd);
            }
        } else if (Constants.DISPLAY_BUTTON_RESET.equals(cmd)) {
            //ゲーム画面にてリセットボタンクリック時
            //入力内容初期化メソッドへ
            inputDigitsInitializing();
        } else if (Constants.DISPLAY_BUTTON_CONFIRM.equals(cmd)) {
            //ゲーム画面にて確定ボタンクリック時
            tryTimes = judge(tryTimes, answer);
        } else if (Constants.DISPLAY_BUTTON_NAME_ENTRY_RESET.equals(cmd)) {
            //名前変更画面にてリセットボタンクリック時
            NameEntryPanel.textFieldNameInput.setText("");
        } else if (Constants.DISPLAY_BUTTON_NAME_ENTRY_CONFIRM.equals(cmd)) {
            //名前変更画面にて確定ボタンクリック時
            nameEntryJudge();
        } else if (Constants.BUTTON_GAME_END.equals(cmd)) {
            //タイトル画面にてゲーム終了ボタンクリック時
            Component c = (Component) e.getSource();
            Window w = SwingUtilities.getWindowAncestor(c);
            w.dispose();
        }
    }

    /**
     * 正解設定メソッド
     * ゲーム内での正解の数値を設定する。
     *
     * @return 正解の数値を返す
     */
    public static int[] correctAnswerNumber() {
        //正解の数値用の配列、3つの1桁数字を格納する。
        int[] correct = new int[Constants.CONSTANT_DIGIT_NUMBER];
        //0～9格納用のリストを作成
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            //0～9の数を1つずつリストに格納。
            number.add(i);
        }
        //リストに格納した0～9の数をシャッフルする。
        Collections.shuffle(number);
        for (int i = 0; i < correct.length; i++) {
            //シャッフルしたリストを正解の配列の要素数分格納する。
            correct[i] = number.get(i);
        }
        return correct;
    }

    /**
     * 判定メソッド
     * 入力された数値と正解の数値を比較し、一致しているか処理を行い、入力履歴に格納する。
     *
     * @param tryTimes 現在が何回目の入力か
     * @param answer   正解の数値
     * @return tryTimesの数値を返す
     */
    public int judge(int tryTimes, int[] answer) {
        if (Constants.DISPLAY_TEXT_DISPLAY_NUMBER_NOT_INPUT.equals(GameScreenPanel.labelThreeDigits.getText())) {
            //3桁目まで数字が入力されているか確認
            //入力内容初期化メソッドへ
            inputDigitsInitializing();
            GameScreenPanel.labelErrorMessage.setText(Constants.DISPLAY_TEXT_ERROR_NOT_INPUT_MESSAGE);
            return tryTimes;
        }
        //入力の配列、入力した3桁の数字を1桁ずつに分けて入れる。
        int[] inputArray = new int[Constants.CONSTANT_DIGIT_NUMBER];
        //100の桁を取り出す。
        inputArray[0] = Integer.parseInt(GameScreenPanel.labelOneDigits.getText());
        //10の桁を取り出す。
        inputArray[1] = Integer.parseInt(GameScreenPanel.labelTwoDigits.getText());
        //1の桁を取り出す。
        inputArray[2] = Integer.parseInt(GameScreenPanel.labelThreeDigits.getText());
        if (inputArray[0] == inputArray[1] || inputArray[0] == inputArray[2] || inputArray[1] == inputArray[2]) {
            //数値の重複確認
            //入力内容初期化メソッドへ
            inputDigitsInitializing();
            GameScreenPanel.labelErrorMessage.setText(Constants.DISPLAY_TEXT_ERROR_DUPLICATION_MESSAGE);
            return tryTimes;
        }
        //試行回数を1増やす
        tryTimes++;
        String setTryTimes = String.format(Constants.DISPLAY_TEXT_INPUT_TIMES, tryTimes);
        GameScreenPanel.labelInputTimes.setText(setTryTimes);
        //ヒットブロー計算メソッドへ
        int[] hitBlowCounter = getHitBlow(inputArray, answer);
        if (Constants.CONSTANT_HIT_ANSWER_NUMBER == hitBlowCounter[Constants.CONSTANT_ARRAY_HIT_COUNTER]) {
            //hitが3桁全てである場合はゲームクリアとする。
            layout.show(cardPanel, Constants.CARD_GAME_CLEAR);
            endDate = new Date();
            String setGameClearResult = String.format(Constants.DISPLAY_TEXT_GAME_CLEAR_RESULT, Arrays.toString(answer), tryTimes);
            GameClearPanel.labelResult.setText(setGameClearResult);
            return tryTimes;
        } else if (Constants.CONSTANT_GAME_OVER_LIMIT == tryTimes) {
            //試行回数が10回目でゲームクリアに到達できない場合はゲームオーバーとする。
            layout.show(cardPanel, Constants.CARD_GAME_OVER);
            String setGameOverResult = String.format(Constants.DISPLAY_TEXT_GAME_OVER_RESULT, Arrays.toString(answer));
            GameOverPanel.labelResult.setText(setGameOverResult);
            return tryTimes;
        }
        //履歴格納用に一時保存
        String inputHistory = String.format(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER, Arrays.toString(inputArray), hitBlowCounter[Constants.CONSTANT_ARRAY_HIT_COUNTER], hitBlowCounter[Constants.CONSTANT_ARRAY_BLOW_COUNTER]);
        //何回目の入力かを判断
        switch (tryTimes) {
            case 1 -> GameScreenPanel.labelInputHistoryNumberOne.setText(inputHistory);
            case 2 -> GameScreenPanel.labelInputHistoryNumberTwo.setText(inputHistory);
            case 3 -> GameScreenPanel.labelInputHistoryNumberThree.setText(inputHistory);
            case 4 -> GameScreenPanel.labelInputHistoryNumberFour.setText(inputHistory);
            case 5 -> GameScreenPanel.labelInputHistoryNumberFive.setText(inputHistory);
            case 6 -> GameScreenPanel.labelInputHistoryNumberSix.setText(inputHistory);
            case 7 -> GameScreenPanel.labelInputHistoryNumberSeven.setText(inputHistory);
            case 8 -> GameScreenPanel.labelInputHistoryNumberEight.setText(inputHistory);
            case 9 -> GameScreenPanel.labelInputHistoryNumberNine.setText(inputHistory);
        }
        //入力内容初期化メソッドへ
        inputDigitsInitializing();
        GameScreenPanel.labelErrorMessage.setText(Constants.DISPLAY_TEXT_INPUT_SPACE);
        return tryTimes;
    }

    /**
     * ヒットブロー計算メソッド
     * 入力された数値と正解の数値を比較し、ヒットとブローの数を配列に格納する。
     *
     * @param inputArray 入力された数値の配列
     * @param answer     正解の数値
     * @return ヒット数とブロー数を返す
     */
    public static int[] getHitBlow(int[] inputArray, int[] answer) {
        //ヒットのカウンタ初期化
        int hitCounter = Constants.CONSTANT_HIT_COUNT_FORMAT;
        //ブローのカウンタ初期化
        int blowCounter = Constants.CONSTANT_BLOW_COUNT_FORMAT;
        //ヒットとブローの数値を格納する配列の初期化
        int[] hitBlowCounter = new int[2];
        for (int i = 0; i < inputArray.length; i++) {
            //iが3に到達した時ループから脱出する。
            if (inputArray[i] == answer[i]) {
                //ヒットの処理、入力数値と正解数値の同じ桁同士を比較し、数値が同じ場合はヒットを加算する。
                hitCounter++;
            }
            for (int j = 0; j < inputArray.length; j++) {
                //jが3に到達した時ループから脱出し、iのカウンターを増やし再度カウントし直す。
                if (i != j) {
                    //iとjが同数(ヒットと同じ)の場合は無視して次のループへ。
                    if (answer[i] == inputArray[j]) {
                        //ブローの処理、iとjが違う数値(桁の位置が違う)の要素内の数値を比較し、数値が同じ場合はブローを加算する。
                        blowCounter++;
                    }
                }
            }
        }
        //ヒットの数値を格納
        hitBlowCounter[Constants.CONSTANT_ARRAY_HIT_COUNTER] = hitCounter;
        hitBlowCounter[Constants.CONSTANT_ARRAY_BLOW_COUNTER] = blowCounter;
        return hitBlowCounter;
    }

    /**
     * 名前入力判定メソッド
     * 入力された名前に不備が無いか確認を行う。
     */
    public void nameEntryJudge(){
        String entryName = NameEntryPanel.textFieldNameInput.getText().trim();
        //入力された名前を一時格納
        if(entryName == null){
            //null判定
            return;
        }
        if(entryName.length() >= 11){
            //入力された文字が10文字以内か判定
            return;
        }
        if(entryName.length() == 0){
            //入力された文字が0文字の場合
            entryName = "NoName";
        }
        userName = entryName;
        TitleScreenPanel.labelUserName.setText(String.format(Constants.DISPLAY_TEXT_USER_NAME, userName));
        NameEntryPanel.labelNameEntry.setText(String.format(Constants.DISPLAY_TEXT_NAME_ENTRY, userName));
        NameEntryPanel.textFieldNameInput.setText("");
    }

    /**
     * 入力内容初期化メソッド
     * ゲーム画面で入力された内容を初期状態へ変更する。
     */
    private void inputDigitsInitializing() {
        GameScreenPanel.labelOneDigits.setText(Constants.DISPLAY_TEXT_DISPLAY_NUMBER_NOT_INPUT);
        GameScreenPanel.labelTwoDigits.setText(Constants.DISPLAY_TEXT_DISPLAY_NUMBER_NOT_INPUT);
        GameScreenPanel.labelThreeDigits.setText(Constants.DISPLAY_TEXT_DISPLAY_NUMBER_NOT_INPUT);
    }

    /**
     * 入力履歴初期化メソッド
     * ゲーム画面で格納された履歴を初期状態へ変更する。
     */
    private void inputHistoryNumberInitializing() {
        GameScreenPanel.labelInputHistoryNumberOne.setText(Constants.DISPLAY_TEXT_DISPLAY_HISTORY_NOT_INPUT);
        GameScreenPanel.labelInputHistoryNumberTwo.setText(Constants.DISPLAY_TEXT_DISPLAY_HISTORY_NOT_INPUT);
        GameScreenPanel.labelInputHistoryNumberThree.setText(Constants.DISPLAY_TEXT_DISPLAY_HISTORY_NOT_INPUT);
        GameScreenPanel.labelInputHistoryNumberFour.setText(Constants.DISPLAY_TEXT_DISPLAY_HISTORY_NOT_INPUT);
        GameScreenPanel.labelInputHistoryNumberFive.setText(Constants.DISPLAY_TEXT_DISPLAY_HISTORY_NOT_INPUT);
        GameScreenPanel.labelInputHistoryNumberSix.setText(Constants.DISPLAY_TEXT_DISPLAY_HISTORY_NOT_INPUT);
        GameScreenPanel.labelInputHistoryNumberSeven.setText(Constants.DISPLAY_TEXT_DISPLAY_HISTORY_NOT_INPUT);
        GameScreenPanel.labelInputHistoryNumberEight.setText(Constants.DISPLAY_TEXT_DISPLAY_HISTORY_NOT_INPUT);
        GameScreenPanel.labelInputHistoryNumberNine.setText(Constants.DISPLAY_TEXT_DISPLAY_HISTORY_NOT_INPUT);
    }
}