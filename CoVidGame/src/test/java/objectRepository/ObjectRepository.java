package objectRepository;

//This is a placeholder class to add objects located under respective Pages
public class ObjectRepository {

//  Web elements on the following landing page: https://responsivefight.herokuapp.com/
    public class HomePageLocators {
        public static final String WarriorNameTextbox_css = "#worrior_username";
        public static final String CreateAWarriorButton_css = "#warrior";
        public static final String StartYourJourney_xpath = "//a[contains(text(),'Start your journey')]";
    }

//   Web elements on the following battlefield page: https://responsivefight.herokuapp.com/covid
    public class BattlefieldFieldPageLocators {
        public static final String HeadingOnBattlefieldPage_xpath = "//p[contains(text(),'COVID-19 THE GAME')]";
        public static final String ChooseYourBattleFieldTitle_xpath = "//p[contains(text(),'Choose your battle field')]";
        public static final String BattleField_PublicPlace_css = "#restaurant";
        public static final String BattleField_Bus_css = "#bus";
        public static final String BattleField_Office_css = "#office";
        public static final String BattleField_Game_css = "#news";
    }

//   Web elements on the all the 4 battlefield choices from the first till the last question: https://responsivefight.herokuapp.com/news, https://responsivefight.herokuapp.com/bus, https://responsivefight.herokuapp.com/restaurant, https://responsivefight.herokuapp.com/office
    public class QuestionnairePageLocators {
        public static final String StartButtonPopup_css = "[id$='start']";

//      Objects for questionnaire under Public place battlefield
        public static final String YouAreAtARestaurant_xpath = "//*[contains(text(),'You notice a large group of people waiting in line next to each other at a restaurant, what do you do?')]";
        public static final String YouAreAtARestaurantAnswer_xpath = "//*[contains(text(), 'Use your super hero sanitizer, keep a safe distance and advise they should keep 1.5 metres away from others')]";
        public static final String TryTheNextBattle_xpath = "//*[contains(text(), 'Try the next battle')]";
        public static final String Continue_css = "#continue";

        public static final String YouHaveEnteredTheOffice_xpath = "//*[contains(text(),'Your coworker Markus, is constantly coughing in the office, what do you do?')]";
        public static final String YouHaveEnteredTheOfficeAnswer_xpath = "//*[contains(text(),'Use your superhero Social Distance and notify your Manager')]";

        public static final String YouHaveTakenThePublicBus_xpath = "//*[contains(text(),'You must travel to buy food and medical supplies?')]";
        public static final String YouHaveTakenThePublicBusAnswer_xpath = "//*[contains(text(),'Use your superheroes Mask and sanitizer while traveling on public transport and clean your hands regularly.')]";

        public static final String YouAreSeatedAtARestaurant_xpath = "//*[contains(text(),'You notice one of the waiters serving food is ill and handling orders at a restaurant, what do you do?')]";
        public static final String YouAreSeatedAtARestaurantAnswer_xpath = "//*[contains(text(),'Use reasonable logic, keep distance from the waiter and report it to management!')]";

        public static final String YouHaveEnteredTheOffice2_xpath = "//*[contains(text(),'Mary from HR, send a memo advising she is ill and everyone should reach her via email, what do you do?')]";
        public static final String YouHaveEnteredTheOfficeAnswer2_xpath = "//*[contains(text(),'Use your superhero Social Distancing, notify your Manager and recommend she should be working from home.')]";

        public static final String YouHaveTakenThePublicBus2_xpath = "//*[contains(text(),'Someone sits next you, and is beginning to cough, what do you do?')]";
        public static final String YouHaveTakenThePublicBusAnswer2_xpath = "//*[contains(text(),'Move to another seat immediately and report it to the driver!')]";

        public static final String YouAreSeatedAtARestaurant2_xpath = "//*[contains(text(),'You notice the people at the bar are re-using shot glasses for a group round of drinks, what do you do?')]";
        public static final String YouAreSeatedAtARestaurantAnswer2_xpath = "//*[contains(text(),'Do not ignore the sign of possible contamination and report it to Management.')]";

        public static final String YouHaveEnteredTheOffice3_xpath = "//*[contains(text(),'Your Manager Alex, tells you his partner recently came back from overseas, and is seen constantly sneezing during the day, what do you do?')]";
        public static final String YouHaveEnteredTheOfficeAnswer3_xpath = "//*[contains(text(),'Use your superhero Social Distance, advise your Manager of the risk and that his partner should be seeking medical advice')]";

        public static final String YouHaveTakenThePublicBus3_xpath = "//*[contains(text(),'You must travel to buy food and medical supplies?')]";
        public static final String YouHaveTakenThePublicBusAnswer3_xpath = "//*[contains(text(),'Cover any sneezes or coughs with your superhero inner elbow or with a tissue that is then discarded.')]";

        public static final String YouAreSeatedAtARestaurant3_xpath = "//*[contains(text(),'You have completed this battleground')]";
        public static final String YouAreSeatedAtARestaurantAnswer3_xpath = "//*[contains(text(),'Check your score')]";


//     Objects for questionnaire under Bus battlefield

        public static final String Bus_YouHaveTakenThePublicBus_xpath = "//*[contains(text(),'You must travel to buy food and medical supplies?')]";
        public static final String Bus_YouHaveTakenThePublicBusAnswer_xpath = "//*[contains(text(),'Use your superheroes Mask and sanitizer while traveling on public transport and clean your hands regularly.')]";

        public static final String Bus_YouAreAtARestaurant_xpath = "//*[contains(text(),'You notice a large group of people waiting in line next to each other at a restaurant, what do you do?')]";
        public static final String Bus_YouAreAtARestaurantAnswer_xpath = "//*[contains(text(),'Use your super hero sanitizer, keep a safe distance and advise they should keep 1.5 metres away from others.')]";

        public static final String Bus_YouHaveEnteredTheOffice_xpath = "//*[contains(text(),'Your coworker Markus, is constantly coughing in the office, what do you do?')]";
        public static final String Bus_YouHaveEnteredTheOfficeAnswer_xpath = "//*[contains(text(),'Use your superhero Social Distance and notify your Manager.')]";

        public static final String Bus_YouHaveTakenThePublicBus1_xpath = "//*[contains(text(),'Someone sits next you, and is beginning to cough, what do you do?')]";
        public static final String Bus_YouHaveTakenThePublicBus1Answer_xpath = "//*[contains(text(),'Move to another seat immediately and report it to the driver!')]";

        public static final String Bus_YouAreAtARestaurant1_xpath = "//*[contains(text(),'You notice one of the waiters serving food is ill and handling orders at a restaurant, what do you do?')]";
        public static final String Bus_YouAreAtARestaurant1Answer_xpath = "//*[contains(text(),'Use reasonable logic, keep distance from the waiter and report it to management!')]";

        public static final String Bus_YouHaveEnteredTheOffice1_xpath = "//*[contains(text(),'Mary from HR, send a memo advising she is ill and everyone should reach her via email, what do you do?')]";
        public static final String Bus_YouHaveEnteredTheOffice1Answer_xpath = "//*[contains(text(),'Use your superhero Social Distancing, notify your Manager and recommend she should be working from home.')]";

        public static final String Bus_YouHaveTakenThePublicBus2_xpath = "//*[contains(text(),'You must travel to buy food and medical supplies?')]";
        public static final String Bus_YouHaveTakenThePublicBus2Answer_xpath = "//*[contains(text(),'Cover any sneezes or coughs with your superhero inner elbow or with a tissue that is then discarded.')]";

        public static final String Bus_YouAreAtARestaurant2_xpath = "//*[contains(text(),'You notice the people at the bar are re-using shot glasses for a group round of drinks, what do you do?')]";
        public static final String Bus_YouAreAtARestaurant2Answer_xpath = "//*[contains(text(),'Do not ignore the sign of possible contamination and report it to Management.')]";

        public static final String Bus_YouHaveEnteredTheOffice2_xpath = "//*[contains(text(),'Your Manager Alex, tells you his partner recently came back from overseas, and is seen constantly sneezing during the day, what do you do?')]";
        public static final String Bus_YouHaveEnteredTheOffice2Answer_xpath = "//*[contains(text(),'Use your superhero Social Distance, advise your Manager of the risk and that his partner should be seeking medical advice')]";

        public static final String Bus_YouHaveTakenThePublicBus3_xpath = "//*[contains(text(),'You have completed this battleground')]";
        public static final String Bus_YouHaveTakenThePublicBus3Answer_xpath = "//*[contains(text(),'Check your score')]";

//      Objects for questionnaire under Office place battlefield

        public static final String Office_YouHaveEnteredTheOffice_xpath = "//*[contains(text(),'Your coworker Markus, is constantly coughing in the office, what do you do?')]";
        public static final String Office_YouHaveEnteredTheOfficeAnswer_xpath = "//*[contains(text(),'Use your superhero Social Distance and notify your Manager.')]";

        public static final String Office_YouHaveTakenThePublicBus_xpath = "//*[contains(text(),'You must travel to buy food and medical supplies?')]";
        public static final String Office_YouHaveTakenThePublicBusAnswer_xpath = "//*[contains(text(),'Use your superheroes Mask and sanitizer while traveling on public transport and clean your hands regularly.')]";

        public static final String Office_YouAreAtARestaurant_xpath = "//*[contains(text(),'You notice a large group of people waiting in line next to each other at a restaurant, what do you do?')]";
        public static final String Office_YouAreAtARestaurantAnswer_xpath = "//*[contains(text(),'Use your super hero sanitizer, keep a safe distance and advise they should keep 1.5 metres away from others.')]";

        public static final String Office_YouHaveEnteredTheOffice1_xpath = "//*[contains(text(),'Mary from HR, send a memo advising she is ill and everyone should reach her via email, what do you do?')]";
        public static final String Office_YouHaveEnteredTheOffice1Answer_xpath = "//*[contains(text(),'Use your superhero Social Distancing, notify your Manager and recommend she should be working from home.')]";

        public static final String Office_YouHaveTakenThePublicBus1_xpath = "//*[contains(text(),'Someone sits next you, and is beginning to cough, what do you do?')]";
        public static final String Office_YouHaveTakenThePublicBus1Answer_xpath = "//*[contains(text(),'Move to another seat immediately and report it to the driver!')]";

        public static final String Office_YouAreAtARestaurant1_xpath = "//*[contains(text(),'You notice one of the waiters serving food is ill and handling orders at a restaurant, what do you do?')]";
        public static final String Office_YouAreAtARestaurant1Answer_xpath = "//*[contains(text(),'Use reasonable logic, keep distance from the waiter and report it to management!')]";

        public static final String Office_YouHaveEnteredTheOffice2_xpath = "//*[contains(text(),'Your Manager Alex, tells you his partner recently came back from overseas, and is seen constantly sneezing during the day, what do you do?')]";
        public static final String Office_YouHaveEnteredTheOffice2Answer_xpath = "//*[contains(text(),'Use your superhero Social Distance, advise your Manager of the risk and that his partner should be seeking medical advice')]";

        public static final String Office_YouHaveTakenThePublicBus2_xpath = "//*[contains(text(),'You must travel to buy food and medical supplies?')]";
        public static final String Office_YouHaveTakenThePublicBus2Answer_xpath = "//*[contains(text(),'Cover any sneezes or coughs with your superhero inner elbow or with a tissue that is then discarded.')]";

        public static final String Office_YouAreAtARestaurant2_xpath = "//*[contains(text(),'You notice the people at the bar are re-using shot glasses for a group round of drinks, what do you do?')]";
        public static final String Office_YouAreAtARestaurant2Answer_xpath = "//*[contains(text(),'Do not ignore the sign of possible contamination and report it to Management.')]";

        public static final String Office_YouHaveEnteredTheOffice3_xpath = "//*[contains(text(),'You have completed this battleground')]";
        public static final String Office_YouHaveEnteredTheOffice3Answer_xpath = "//*[contains(text(),'Check your score')]";

//     Objects for questionnaire under "Are you game?" battlefield

        public static final String AreYouGame_xpath = "//*[contains(text(),'You have a cough and a mild temperature.')]";
        public static final String AreYouGameAnswer_xpath = "//*[contains(text(),'Find your closest COVID-19 testing clinics, and get tested')]";

        public static final String AreYouGame0_xpath = "//*[contains(text(),'Your coworker Markus, is constantly coughing in the office, what do you do?')]";
        public static final String AreYouGame0Answer_xpath = "//*[contains(text(),'Use your superhero Social Distance and notify your Manager')]";

        public static final String AreYouGame1_xpath = "//*[contains(text(),'You notice a large group of people waiting in line next to each other at a restaurant, what do you do?')]";
        public static final String AreYouGame1Answer_xpath = "//*[contains(text(),'Use your super hero sanitizer, keep a safe distance and advise they should keep 1.5 metres away from others.')]";

        public static final String AreYouGame2_xpath = "//*[contains(text(),'Someone sits next you, and is beginning to cough, what do you do?')]";
        public static final String AreYouGame2Answer_xpath = "//*[contains(text(),'Move to another seat immediately and report it to the driver!')]";

        public static final String AreYouGame3_xpath = "//*[contains(text(),'Mary from HR, send a memo advising she is ill and everyone should reach her via email, what do you do?')]";
        public static final String AreYouGame3Answer_xpath = "//*[contains(text(),'Use your superhero Social Distancing, notify your Manager and recommend she should be working from home.')]";

        public static final String AreYouGame4_xpath = "//*[contains(text(),'You notice one of the waiters serving food is ill and handling orders at a restaurant, what do you do?')]";
        public static final String AreYouGame4Answer_xpath = "//*[contains(text(),'Use reasonable logic, keep distance from the waiter and report it to management!')]";

        public static final String AreYouGame5_xpath = "//*[contains(text(),'You must travel to buy food and medical supplies?')]";
        public static final String AreYouGame5Answer_xpath = "//*[contains(text(),'Cover any sneezes or coughs with your superhero inner elbow or with a tissue that is then discarded.')]";

        public static final String AreYouGame6_xpath = "//*[contains(text(),'Your Manager Alex, tells you his partner recently came back from overseas, and is seen constantly sneezing during the day, what do you do?')]";
        public static final String AreYouGame6Answer_xpath = "//*[contains(text(),'Use your superhero Social Distance, advise your Manager of the risk and that his partner should be seeking medical advice')]";

        public static final String AreYouGame7_xpath = "//*[contains(text(),'You notice the people at the bar are re-using shot glasses for a group round of drinks, what do you do?')]";
        public static final String AreYouGame7Answer_xpath = "//*[contains(text(),'Do not ignore the sign of possible contamination and report it to Management.')]";

        public static final String AreYouGame8_xpath = "//*[contains(text(),'You must travel to buy food and medical supplies?')]";
        public static final String AreYouGame8Answer_xpath = "//*[contains(text(),'Use your superheroes Mask and sanitizer while traveling on public transport and clean your hands regularly.')]";

        public static final String AreYouGame9_xpath = "//*[contains(text(),'Fantastic, you have succeeded on all battlefields and have not contracted covid19. A cure is not out there yet so make sure you continue the good work and keep yourself and others safe.')]";
        public static final String AreYouGame9Answer_xpath = "//*[contains(text(),'Yes I know')]";

    }
    }


