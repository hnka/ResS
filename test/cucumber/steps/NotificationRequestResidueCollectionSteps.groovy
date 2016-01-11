package steps

import pages.HarvestSolicitationViewPage
import pages.SolicitacaoColetaViewPage
import residueGenerator.HarvestSolicitation
import residueGenerator.ResidueGenerator
import static cucumber.api.groovy.EN.*


Given (~'^that the system receives a request by "([^"]*)" for an email to be resent$') { String name ->

    SolicitacaoColetaTestDataAndOperations.createGeneratorByName(name)
    residue = ResidueGenerator.findByNameGenerator(name)

    assert residue != null && residue.hasActiveHarvest
}


When (~'^the system confirms that there are pending requests$') { ->
    SolicitacaoColetaTestDataAndOperations.createHarvestSolicitationByGenerator(residue)
    harvestSolicitation = HarvestSolicitation.findByResidueGenerator(residue)

    assert harvestSolicitation.residue != null && harvestSolicitation != null && harvestSolicitation.status == "Pending"
}


Then (~'^the system resends the email with the data of the pending requests to the city hall and the researcher$') { ->
//resend email is not implemented
}



And(~'^generates a notification of email sending confirmation$') {->

//not implemented 
}



//GUI

Given(~'^I am logged into the restaurant account in which I work$') { ->
    //login not implemented yet
}

And(~'^I’m on the page of requested collections$'){ ->
    to SolicitacaoColetaViewPage
    at SolicitacaoColetaViewPage
}
And (~'^there has been a open collection request for some time$') { ->
//not implemented yet
}


When(~'I select the resend email notification option$') { ->
   page.resendEmail()

}

Then(~'^I see a confirmation message$') { ->
	to SolicitacaoColetaViewPage
    at SolicitacaoColetaViewPage
    assert page.hasOk()
}
