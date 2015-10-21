package steps


import pages.LoginPage
import pages.HomePage
import residueGenerator.ResidueGenerator
import steps.GeneratorTestDataAndOperations
import steps.LoginTestDataAndOperations

import static cucumber.api.groovy.EN.*

// CONTROLLER STEPS

Given (~'^that there is an account registered by "([^"]*)" in the system$'){
       String name -> account = GeneratorTestDataAndOperations.findGeneratorByName(name)
       assert account != null
}

When (~'^I submit the "([^"]*)" CNPJ$'){
    String cnpj -> account = GeneratorTestDataAndOperations.createGeneratorCnpj(cnpj)
        assert account != null
}

And (~'^I submit the "([^"]*)" password$'){
    String pass -> account = LoginTestDataAndOperations.findAccountByPassword(pass)
        assert account != null
}


Then (~'^I get access to repository of information in the system'){
   -> assert LoginTestDataAndOperations.findAccountByPassword(pass) != null
}

//GUI

Given (~'^that I have an account registered in the system$'){
     -> at LoginPage
}

When (~'^I enter "([^"]*)" in the CNPJ field$'){
    String cnpj -> at LoginPage
        LoginPage.fillCnpj(cnpj)
        account = GeneratorTestDataAndOperations.createGeneratorCnpj(cnpj)
        assert account != null
}

And (~'^I enter "([^"]*)" password in the password field$'){
    String pass ->at LoginPage
        LoginPage.fillPass(pass)
        account = LoginTestDataAndOperations.findAccountByPassword(pass)
        assert account != null

}


Then (~'^I get redirected to my dashboard page'){
    ->at LoginPage
    to HomePage
}

And (~'^I get flashed a notice saying that I\'ve logged in'){
    -> at HomePage
    LoginPage.select("flash")
}