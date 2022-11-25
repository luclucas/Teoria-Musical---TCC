package com.lulu.teoriamusical.enums

import com.lulu.teoriamusical.view.moduloI.caracteristicas.TelaCaracteristicas
import com.lulu.teoriamusical.view.moduloI.clavefa.TelaClaveFa
import com.lulu.teoriamusical.view.moduloI.clavesol.TelaClaveSol
import com.lulu.teoriamusical.view.moduloI.duracoes.TelaDuracoes
import com.lulu.teoriamusical.view.moduloI.notas.TelaNotas
import com.lulu.teoriamusical.view.moduloI.pautas.TelaPauta

enum class Telas(val e: Class<*>) {
    CARACTERISTICAS(TelaCaracteristicas::class.java),
    NOTAS(TelaNotas::class.java),
    PAUTA(TelaPauta::class.java),
    CLAVE_SOL(TelaClaveSol::class.java),
    CLAVE_FA(TelaClaveFa::class.java),
    DURACOES(TelaDuracoes::class.java)
}