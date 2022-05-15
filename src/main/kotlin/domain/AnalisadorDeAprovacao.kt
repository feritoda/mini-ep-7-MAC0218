package domain

import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {

    private lateinit var criterioSelecionado

    fun defineCriterio(criterio: CriterioDeAprovacao) {
        criterioSelecionado = criterio
    }

    fun fechaBoletim(boletim: Boletim): BoletimFechado {
        val mediaFinal = criterioSelecionado. mediaFinal(boletim)
        val estaAprovado = criterioSelecionado.estaAprovado(boletim)
 
        return BoletimFechado(boletim.mediaEPs, boletim.mediaMiniEPs, mediaFinal, estaAprovado)
    }

}
