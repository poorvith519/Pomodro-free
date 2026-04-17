/*
 * Copyright (c) 2025-2026 Nishant Mishra
 *
 * This file is part of Pomodoro - a minimalist pomodoro timer for Android.
 *
 * Pomodoro is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 */

package org.nsh07.pomodoro.ui.settingsScreen.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.SegmentedListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.nsh07.pomodoro.ui.theme.CustomColors.listItemColors
import org.nsh07.pomodoro.ui.theme.PomodoroShapeDefaults.segmentedListItemShapes
import pomodoro.shared.generated.resources.Res
import pomodoro.shared.generated.resources.app_name_plus
import pomodoro.shared.generated.resources.arrow_forward_big
import pomodoro.shared.generated.resources.tomato_logo_notification

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun PlusPromo(
    isPlus: Boolean,
    setShowPaywall: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    // All features are always unlocked - always show the "plus" state
    SegmentedListItem(
        onClick = { },
        leadingContent = {
            Icon(
                painterResource(Res.drawable.tomato_logo_notification),
                null,
                modifier = Modifier.size(24.dp)
            )
        },
        content = {
            Text(stringResource(Res.string.app_name_plus))
        },
        trailingContent = {
            Icon(
                painterResource(Res.drawable.arrow_forward_big),
                null
            )
        },
        selected = false,
        shapes = segmentedListItemShapes(0, 1),
        colors = listItemColors,
        modifier = modifier
    )
}
