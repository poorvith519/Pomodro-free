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

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.stringResource
import pomodoro.shared.generated.resources.Res
import pomodoro.shared.generated.resources.tomato_plus_desc

// This component is never shown since all features are always unlocked (isPlus = true)
@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun PlusDivider(
    setShowPaywall: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(contentAlignment = Alignment.Center, modifier = modifier.padding(vertical = 14.dp)) {
        HorizontalDivider(modifier = Modifier.clip(CircleShape), thickness = 4.dp)
        Box(
            modifier = Modifier
                .background(colorScheme.surfaceContainer)
                .padding(horizontal = 8.dp)
        ) {
            Text(stringResource(Res.string.tomato_plus_desc), style = typography.titleSmall)
        }
    }
}
