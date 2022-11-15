package com.lulu.teoriamusical.enums

import com.lulu.teoriamusical.view.moduloI.caracteristicas.TelaCaracteristicas
import com.lulu.teoriamusical.view.moduloI.notas.TelaNotas
import com.lulu.teoriamusical.view.moduloI.pautas.TelaPauta

enum class Telas(val e: Class<*>) {
    CARACTERISTICAS(TelaCaracteristicas::class.java), NOTAS(TelaNotas::class.java), PAUTA(TelaPauta::class.java)
}