package steps

import residueGenerator.ResidueGenerator


class LoginTestDataAndOperations {


    static  generators = [

            [nameGenerator:"Los Polos",
             type: "Restaurante",
             cnpj: "testecnpj1",
             password: "345" ,
             addressGenerator: "Bubble Street number 7",
             averageMonthlyMeals: 0,
             averageDailyMeals: 0],


    ]


    static public def findAccountByPassword(String pass) {
        generators.find { generator ->
            generator.password == pass
        }
    }

}
