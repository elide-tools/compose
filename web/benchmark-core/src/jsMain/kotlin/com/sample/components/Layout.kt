package com.sample.components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.selectors.*
import org.jetbrains.compose.web.attributes.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.*
import com.sample.style.WtContainer
import com.sample.style.WtOffsets
import com.sample.style.WtSections

@Composable
fun Layout(content: @Composable () -> Unit) {
    Div(
        attrs = {
            style {
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
                height(100.percent)
                margin(0.px)
                property("box-sizing", StylePropertyValue("border-box"))
            }
        }
    ) {
        content()
    }
}

@Composable
fun MainContentLayout(content: @Composable () -> Unit) {
    Main(
        attrs = {
            style {
                property("flex", value("1 0 auto"))
                property("box-sizing", value("border-box"))
            }
        }
    ) {
        content()
    }
}

@Composable
fun ContainerInSection(sectionThemeStyleClass: String? = null, content: @Composable () -> Unit) {
    Section(attrs = {
        if (sectionThemeStyleClass != null) {
            classes(WtSections.wtSection, sectionThemeStyleClass)
        } else {
            classes(WtSections.wtSection)
        }
    }) {
        Div(
            attrs = {
                classes(WtContainer.wtContainer, WtOffsets.wtTopOffset96)
            }
        ) {
            content()
        }
    }
}