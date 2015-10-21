package steps

import pages.ColetaCreatePage
import pages.ColetaListPage
import HistoricoDeColeta.Coleta
import static cucumber.api.groovy.EN.*

//Created by Ricardo Barioni on 03/10/2015

//CENARIO CONTROLADOR:
//Scenario: Blank Name input
/*
Given (~'^I am logged in the system as a restaurant$'){ ->
    //login not implemented yet
}

When (~'^I register a residue collection request with Name "([^"]*)"$'){String name ->
    keepName = name
    CreateColetaTestDataAndOperations.createColetaWithName(name)
}

Then (~'^The residue request is not generated$'){ ->
    assert Coleta.findByName(keepName) == null
}

//CENARIO CONTROLADOR:
//Scenario: Invalid volume input

Given (~'^I am logged in the system as a restaurant$'){ ->
    //login not implemented yet
}

When (~'^I register a residue collection request with Volume "([^"]*)"$'){String volume ->
    keepVolume = volume
    CreateColetaTestDataAndOperations.createColetaWithVolume(volume)
}

Then (~'^The residue request is not generated$'){ ->
    assert Coleta.findByVolume(keepVolume) == null
}

//CENARIO GUI:
//Scenario: Blank Name input

Given (~'^I am at creating collection page$'){ ->
    to ColetaCreatePage
    at ColetaCreatePage
}

When (~'^I fill the request information with Name "([^"]*)"$'){String name ->
    page.fillName(name)
}

And (~'^I fill the other fields$'){ ->
    page.fillDataAndVolume()
}

And (~'^Select “Create”$'){ ->
    page.submit()
}

Then (~'^I see a error message$'){ ->
    to ColetaListPage
    at ColetaListPage
    assert page.hasErrors()
}

//CENARIO GUI:
//Scenario: Invalid volume input

Given (~'^I am at creating collection page$'){ ->
    to ColetaCreatePage
    at ColetaCreatePage
}

When (~'^I fill the request information with Volume "([^"]*)"$'){String volume ->
    page.fillVolume(volume)
}

And (~'^I fill the other fields$'){ ->
    page.fillNameAndData()
}

And (~'^Select “Create”$'){ ->
    page.submit()
}

Then (~'^I see a error message$'){ ->
    to ColetaListPage
    at ColetaListPage
    assert page.hasErrors()
}*/
