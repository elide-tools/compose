package org.jetbrains.compose.common.foundation.layout

import org.jetbrains.compose.common.ui.Modifier
import androidx.compose.runtime.Composable
import org.jetbrains.compose.common.ui.ExperimentalComposeWebWidgetsApi

@Composable
@ExperimentalComposeWebWidgetsApi
internal expect fun BoxActual(modifier: Modifier, content: @Composable () -> Unit)
