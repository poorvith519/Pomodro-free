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

package org.nsh07.pomodoro.ui.settingsScreen.components

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonGroupDefaults
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.SegmentedListItem
import androidx.compose.material3.Text
import androidx.compose.material3.ToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEachIndexed
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.nsh07.pomodoro.ui.theme.CustomColors.listItemColors
import org.nsh07.pomodoro.ui.theme.PomodoroShapeDefaults.segmentedListItemShapes
import pomodoro.shared.generated.resources.Res
import pomodoro.shared.generated.resources.brightness_auto
import pomodoro.shared.generated.resources.dark
import pomodoro.shared.generated.resources.dark_mode
import pomodoro.shared.generated.resources.light
import pomodoro.shared.generated.resources.light_mode
import pomodoro.shared.generated.resources.system_default
import pomodoro.shared.generated.resources.theme


@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun ThemePickerListItem(
    theme: String,
    items: Int,
    index: Int,
    onThemeChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    val themeMap: Map<String, Pair<DrawableResource, StringResource>> = remember {
        mapOf(
            "auto" to Pair(
                Res.drawable.brightness_auto,
                Res.string.system_default
            ),
            "light" to Pair(Res.drawable.light_mode, Res.string.light),
            "dark" to Pair(Res.drawable.dark_mode, Res.string.dark)
        )
    }

    SegmentedListItem(
        onClick = {},
        leadingContent = {
            AnimatedContent(themeMap[theme]!!.first) {
                Icon(
                    painter = painterResource(it),
                    contentDescription = null,
                )
            }
        },
        content = { Text(stringResource(Res.string.theme)) },
        supportingContent = {
            val options = themeMap.toList()
            val selectedIndex = options.indexOf(Pair(theme, themeMap[theme]))

            Row(
                horizontalArrangement = Arrangement.spacedBy(ButtonGroupDefaults.ConnectedSpaceBetween),
                modifier = Modifier.padding(top = 8.dp)
            ) {
                options.fastForEachIndexed { index, theme ->
                    val isSelected = selectedIndex == index
                    ToggleButton(
                        checked = isSelected,
                        onCheckedChange = { onThemeChange(theme.first) },
                        modifier = Modifier
                            .weight(1f)
                            .semantics { role = Role.RadioButton },
                        shapes =
                            when (index) {
                                0 -> ButtonGroupDefaults.connectedLeadingButtonShapes()
                                options.lastIndex -> ButtonGroupDefaults.connectedTrailingButtonShapes()
                                else -> ButtonGroupDefaults.connectedMiddleButtonShapes()
                            },
                    ) {
                        Text(
                            stringResource(theme.second.second),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }
            }
        },
        colors = listItemColors,
        shapes = segmentedListItemShapes(index, items),
        modifier = modifier
    )
}
