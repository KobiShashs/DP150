package family_02_structural.dp_01_facade;

import family_02_structural.dp_01_facade.service.MorningService;

/**
 * Created by kobis on 03 Apr, 2023
 */
public class App {

    public static void main(String[] args) {
        MorningService morningService = new MorningService();
        System.out.println(morningService.goodMorningSir());
    }
}
