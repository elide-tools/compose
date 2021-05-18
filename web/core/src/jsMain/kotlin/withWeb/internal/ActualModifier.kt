/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.compose.common.internal

import org.jetbrains.compose.common.ui.Modifier
import androidx.compose.web.css.StyleBuilder
import androidx.compose.web.attributes.AttrsBuilder

class ActualModifier : Modifier {
    val styleHandlers = mutableListOf<StyleBuilder.() -> Unit>()
    val attrHandlers = mutableListOf<AttrsBuilder<*>.() -> Unit>()

    fun add(builder: StyleBuilder.() -> Unit) {
        styleHandlers.add(builder)
    }

    fun addAttributeBuilder(builder: AttrsBuilder<*>.() -> Unit) {
        attrHandlers.add(builder)
    }
}

fun Modifier.castOrCreate(): ActualModifier = (this as? ActualModifier) ?: ActualModifier()