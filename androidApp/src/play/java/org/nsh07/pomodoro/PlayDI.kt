/*
 * Copyright (c) 2025 Nishant Mishra
 *
 * This file is part of Pomodoro - a minimalist pomodoro timer for Android.
 *
 * Pomodoro is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * Pomodoro is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Pomodoro.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package org.nsh07.pomodoro

import org.koin.dsl.module
import org.nsh07.pomodoro.billing.BillingManager
import org.nsh07.pomodoro.billing.PlayBillingManager
import org.nsh07.pomodoro.billing.PomodoroPlusPaywallDialog
import org.nsh07.pomodoro.di.FlavorUI
import org.nsh07.pomodoro.ui.settingsScreen.components.BottomButton
import org.nsh07.pomodoro.ui.settingsScreen.components.TopButton


val flavorModule = module {
    single<BillingManager> { PlayBillingManager() }
}

val flavorUiModule = module {
    single {
        FlavorUI(
            pomodoroPlusPaywallDialog = ::PomodoroPlusPaywallDialog,
            topButton = ::TopButton,
            bottomButton = ::BottomButton
        )
    }
}