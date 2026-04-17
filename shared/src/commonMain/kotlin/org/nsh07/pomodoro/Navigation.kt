/*
 * Copyright (c) 2025-2026 Nishant Mishra
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

import org.nsh07.pomodoro.ui.Screen
import org.nsh07.pomodoro.ui.SettingsNavItem
import pomodoro.shared.generated.resources.Res
import pomodoro.shared.generated.resources.alarm
import pomodoro.shared.generated.resources.alarm_sound
import pomodoro.shared.generated.resources.always_on_display
import pomodoro.shared.generated.resources.appearance
import pomodoro.shared.generated.resources.black_theme
import pomodoro.shared.generated.resources.color_scheme
import pomodoro.shared.generated.resources.dnd
import pomodoro.shared.generated.resources.durations
import pomodoro.shared.generated.resources.media_volume_for_alarm
import pomodoro.shared.generated.resources.palette
import pomodoro.shared.generated.resources.sound
import pomodoro.shared.generated.resources.theme
import pomodoro.shared.generated.resources.timer
import pomodoro.shared.generated.resources.timer_filled
import pomodoro.shared.generated.resources.vibrate

val settingsScreens = listOf(
    SettingsNavItem(
        Screen.Settings.Timer,
        Res.drawable.timer_filled,
        Res.string.timer,
        listOf(Res.string.durations, Res.string.dnd, Res.string.always_on_display)
    ),
    SettingsNavItem(
        Screen.Settings.Alarm,
        Res.drawable.alarm,
        Res.string.alarm,
        listOf(
            Res.string.alarm_sound,
            Res.string.sound,
            Res.string.vibrate,
            Res.string.media_volume_for_alarm
        )
    ),
    SettingsNavItem(
        Screen.Settings.Appearance,
        Res.drawable.palette,
        Res.string.appearance,
        listOf(Res.string.theme, Res.string.color_scheme, Res.string.black_theme)
    )
)
