package com.example.demo;

public class Constants {
    public static final String DISPLAY_NAME_FRAME_TITLE = "Hit & Blow";
    public static final String DISPLAY_TEXT_TITLE = "Hit & Blow";
    public static final int SIZE_FRAME_WIDTH = 800;
    public static final int SIZE_FRAME_HEIGHT = 600;
    public static final String DISPLAY_BUTTON_NAME_ENTRY = "名前変更";
    public static final String DISPLAY_BUTTON_GAME_START = "ゲームスタート";
    public static final String DISPLAY_BUTTON_RULE_DESCRIPTION = "ルール説明";
    public static final String DISPLAY_BUTTON_RANKING = "ランキング";
    public static final String DISPLAY_BUTTON_GAME_END = "ゲーム終了";
    public static final String DISPLAY_TEXT_INPUT_HISTORY_MESSAGE = "入力履歴";
    public static final String DISPLAY_TEXT_INPUT_HISTORY_DESCRIPTION = "入力数値:Hit:Blow";
    public static final String DISPLAY_TEXT_INPUT_HISTORY_NUMBER = "%s:%s:%s";
    public static final String DISPLAY_TEXT_DISPLAY_NUMBER = "%s";
    public static final String DISPLAY_TEXT_DISPLAY_NUMBER_NOT_INPUT = "-";
    public static final String DISPLAY_TEXT_DISPLAY_HISTORY_NOT_INPUT = "-:-:-";
    public static final String DISPLAY_BUTTON_NAME_ENTRY_RESET = "NameEntryリセット";
    public static final String DISPLAY_BUTTON_NAME_ENTRY_CONFIRM = "NameEntry確定";
    public static final String DISPLAY_BUTTON_ONE = "1";
    public static final String DISPLAY_BUTTON_TWO = "2";
    public static final String DISPLAY_BUTTON_THREE = "3";
    public static final String DISPLAY_BUTTON_FOUR = "4";
    public static final String DISPLAY_BUTTON_FIVE = "5";
    public static final String DISPLAY_BUTTON_SIX = "6";
    public static final String DISPLAY_BUTTON_SEVEN = "7";
    public static final String DISPLAY_BUTTON_EIGHT = "8";
    public static final String DISPLAY_BUTTON_NINE = "9";
    public static final String DISPLAY_BUTTON_ZERO = "0";
    public static final String DISPLAY_BUTTON_RESET = "リセット";
    public static final String DISPLAY_BUTTON_CONFIRM = "確定";
    public static final String DISPLAY_BUTTON_GIVE_UP = "ギブアップ";
    public static final String DISPLAY_TEXT_INPUT_TIMES = "入力回数:%d回";
    public static final String DISPLAY_TEXT_INPUT_SPACE = "";
    public static final int SIZE_TEXT_TITLE = 100;
    public static final int SIZE_TEXT_INPUT_HISTORY_MESSAGE = 24;
    public static final int SIZE_TEXT_INPUT_HISTORY_DESCRIPTION = 18;
    public static final int SIZE_TEXT_INPUT_HISTORY_NUMBER = 20;
    public static final int SIZE_TEXT_DISPLAY_NUMBER = 28;
    public static final int SIZE_TEXT_USER_NAME = 20;
    public static final int SIZE_SCREEN_TRANSITION_BUTTON = 30;
    public static final int SIZE_SCREEN_TRANSITION_BUTTON_NAME_ENTRY = 20;
    public static final int SIZE_NUMBER_BUTTON = 24;
    public static final int SIZE_NUMBER_BUTTON_RESET = 12;
    public static final int SIZE_NUMBER_BUTTON_CONFIRM = 16;
    public static final int SIZE_NUMBER_BUTTON_GIVE_UP = 10;
    public static final int SIZE_TEXT_INPUT_TIMES = 16;
    public static final int SIZE_TEXT_ERROR_MESSAGE = 16;
    public static final int SIZE_TEXT_RULE_DESCRIPTION = 18;
    public static final int SIZE_TEXT_GAME_COMPLETE = 30;
    public static final int SIZE_TEXT_NAME_ENTRY = 18;
    public static final int SIZE_TEXT_RANKING = 18;
    public static final int SIZE_NUMBER_BUTTON_WIDTH = 90;
    public static final int SIZE_NUMBER_BUTTON_HEIGHT = 50;
    public static final int CONSTANT_DIGIT_NUMBER = 3;
    public static final int CONSTANT_HIT_COUNT_FORMAT = 0;
    public static final int CONSTANT_BLOW_COUNT_FORMAT = 0;
    public static final int CONSTANT_ARRAY_HIT_COUNTER = 0;
    public static final int CONSTANT_ARRAY_BLOW_COUNTER = 1;
    public static final int CONSTANT_HIT_ANSWER_NUMBER = 3;
    public static final int CONSTANT_GAME_OVER_LIMIT = 10;
    public static final int CONSTANT_TRY_TIMES_COUNT_FORMAT = 0;
    public static final String DISPLAY_TEXT_USER_NAME = "現在の名前：%s";
    public static final String DISPLAY_TEXT_RULE_DESCRIPTION = """
            <html>ヒット&ブローはプログラム側がランダムで設定した数字を当てるゲームです。<br>
            <br>
            このプログラムでは被り無しの0～9の数字が3桁設定されます。<br>
            ユーザー側が3桁の数字を入力し、<br>
            その数字と正解の数字を比較して次のヒントが表示されます。<br>
            <br>
            ヒット:桁の位置も数字も合っている数字の数です。<br>
            ブロー:数字は合っているが、桁の位置が違う数字の数です。<br>
            <br>
            例:正解が[083]入力が[385]の時、<br>
            　 8は桁も数字も合っている為ヒット、<br>
            　 3は桁の位置が違うが数字は合っている為ブローとなり、<br>
            　 ヒットとブローの数がそれぞれ1つずつの為、ヒット:1 ブロー:1と表示されます。<br>
            <br>
            その後、再度数字の入力から繰り返し、3桁全部の数字を当てた場合はゲームクリアです。<br>
            少ない回数でのクリアを目指してください。<br>
            <br>
            10回目の入力までに正解の数字を見つけられないとゲームオーバーになります。<br>
            また、数値入力時にGを入力するとギブアップとしてゲームを終了する事が出来ます。<br>
            <br></html>
            """;
    public static final String DISPLAY_BUTTON_BACK_TO_TITLE = "タイトルに戻る";
    public static final String DISPLAY_TEXT_GAME_CLEAR_RESULT = """
            <html><body align=center>ゲームクリア！<br/>
            <br/>
            正解の数字は%sでした！<br/>
            <br/>
            入力回数:%d回<br/></body align=center></html>
            """;
    public static final String DISPLAY_TEXT_GAME_OVER_RESULT = """
            <html><body align=center>ゲームオーバー！<br/>
            <br/><br/>
            正解の数字は%sでした！<br/><br/></body align=center></html>
            """;
    public static final String DISPLAY_TEXT_NAME_ENTRY = """
            <html><body align=center>名前変更<br/>
            <br/>
            ランキングに掲載する際の名前を入力してください。(10文字以内)<br/>
            <br/>
            現在の名前：%s<br/></body align=center></html>
            """;
    public static final String DISPLAY_TEXT_RANKING = """
            <html><body align=center>ランキング<br/>
            <br/>
            ここにランキングの内容が表示される予定テスト%s<br/></body align=center></html>
            """;
    public static final String DISPLAY_TEXT_ERROR_DUPLICATION_MESSAGE = "数字に重複があります。";
    public static final String DISPLAY_TEXT_ERROR_NOT_INPUT_MESSAGE = "未入力の桁があります。";
    public static final String FONT_MS_GOTHIC = "ＭＳ ゴシック";
    public static final String CARD_TITLE_SCREEN = "CardTitleScreen";
    public static final String CARD_RULE_DESCRIPTION = "CardRuleDescription";
    public static final String CARD_GAME_SCREEN = "CardGameScreen";
    public static final String CARD_GAME_CLEAR = "CardGameClear";
    public static final String CARD_GAME_OVER = "CardGameOver";
    public static final String CARD_NAME_ENTRY = "CardNameEntry";
    public static final String CARD_RANKING = "CardRanking";
    public static final String BUTTON_GAME_END = "ButtonTitleScreenGameEnd";
    public static final String TEST_DISPLAY_BUTTON_GAME_START = "ゲームスタート";
    public static final String TEST_DISPLAY_BUTTON_RULE_DESCRIPTION = "ルール説明";
    public static final String TEST_DISPLAY_BUTTON_GAME_END = "ゲーム終了";
    public static final String TEST_DISPLAY_NUMBER_NOT_INPUT = "-";
    public static final String TEST_DISPLAY_TEXT_DISPLAY_HISTORY_NOT_INPUT = "-:-:-";
    public static final String TEST_INPUT_NUMBER_ONE = "1";
    public static final String TEST_INPUT_NUMBER_TWO = "2";
    public static final String TEST_INPUT_NUMBER_THREE = "3";
    public static final String TEST_DISPLAY_BUTTON_RESET = "リセット";
    public static final String TEST_DISPLAY_BUTTON_CONFIRM = "確定";
    public static final String TEST_DISPLAY_BUTTON_GIVE_UP = "ギブアップ";
    public static final String TEST_DISPLAY_TEXT_INPUT_TIMES = "入力回数:0回";
    public static final String TEST_DISPLAY_TEXT_INPUT_SPACE = "";
    public static final int TEST_ELEMENT_DIGITS = 3;
    public static final int TEST_HIT_ZERO = 0;
    public static final int TEST_HIT_ONE = 1;
    public static final int TEST_HIT_TWO = 2;
    public static final int TEST_HIT_THREE = 3;
    public static final int TEST_BLOW_ZERO = 0;
    public static final int TEST_BLOW_ONE = 1;
    public static final int TEST_BLOW_TWO = 2;
    public static final int TEST_BLOW_THREE = 3;
    public static final int TEST_CONSTANT_ARRAY_HIT_COUNTER = 0;
    public static final int TEST_CONSTANT_ARRAY_BLOW_COUNTER = 1;
    public static final int TEST_TRY_TIMES_GAME_OVER = 9;
    public static final String TEST_DISPLAY_TEXT_GAME_CLEAR_RESULT = """
            <html><body align=center>ゲームクリア！<br/>
            <br/>
            正解の数字は%sでした！<br/>
            <br/>
            入力回数:%d回<br/></body align=center></html>
            """;
    public static final String TEST_DISPLAY_TEXT_GAME_OVER_RESULT = """
            <html><body align=center>ゲームオーバー！<br/>
            <br/><br/>
            正解の数字は%sでした！<br/><br/></body align=center></html>
            """;
    public static final String TEST_DISPLAY_BUTTON_BACK_TO_TITLE = "タイトルに戻る";
    public static final String TEST_DISPLAY_TEXT_RULE_DESCRIPTION = """
            <html>ヒット&ブローはプログラム側がランダムで設定した数字を当てるゲームです。<br/>
            <br/>
            このプログラムでは被り無しの0～9の数字が3桁設定されます。<br/>
            ユーザー側が3桁の数字を入力し、<br/>
            その数字と正解の数字を比較して次のヒントが表示されます。<br/>
            <br/>
            ヒット:桁の位置も数字も合っている数字の数です。<br/>
            ブロー:数字は合っているが、桁の位置が違う数字の数です。<br/>
            <br/>
            例:正解が[083]入力が[385]の時、<br/>
            　 8は桁も数字も合っている為ヒット、<br/>
            　 3は桁の位置が違うが数字は合っている為ブローとなり、<br/>
            　 ヒットとブローの数がそれぞれ1つずつの為、ヒット:1 ブロー:1と表示されます。<br/>
            <br/>
            その後、再度数字の入力から繰り返し、3桁全部の数字を当てた場合はゲームクリアです。<br/>
            少ない回数でのクリアを目指してください。<br/>
            <br/>
            10回目の入力までに正解の数字を見つけられないとゲームオーバーになります。<br/>
            また、数値入力時にGを入力するとギブアップとしてゲームを終了する事が出来ます。<br/>
            <br/></html>
            """;
    public static final String TEST_DISPLAY_TEXT_ERROR_DUPLICATION_MESSAGE = "数字に重複があります。";
    public static final String TEST_DISPLAY_TEXT_ERROR_NOT_INPUT_MESSAGE = "未入力の桁があります。";
}
