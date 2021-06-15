package org.jetbrains.compose.web.dom

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeNode
import org.jetbrains.compose.web.DomApplier
import org.jetbrains.compose.web.DomNodeWrapper
import org.jetbrains.compose.web.attributes.AttrsBuilder
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.action
import org.jetbrains.compose.web.attributes.alt
import org.jetbrains.compose.web.attributes.forId
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.attributes.label
import org.jetbrains.compose.web.attributes.src
import org.jetbrains.compose.web.attributes.type
import org.jetbrains.compose.web.attributes.value
import kotlinx.browser.document
import org.w3c.dom.HTMLAnchorElement
import org.w3c.dom.HTMLAreaElement
import org.w3c.dom.HTMLAudioElement
import org.w3c.dom.HTMLBRElement
import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.HTMLDataListElement
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLEmbedElement
import org.w3c.dom.HTMLFieldSetElement
import org.w3c.dom.HTMLFormElement
import org.w3c.dom.HTMLHeadingElement
import org.w3c.dom.HTMLHRElement
import org.w3c.dom.HTMLIFrameElement
import org.w3c.dom.HTMLImageElement
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.HTMLLIElement
import org.w3c.dom.HTMLLabelElement
import org.w3c.dom.HTMLLegendElement
import org.w3c.dom.HTMLMapElement
import org.w3c.dom.HTMLMeterElement
import org.w3c.dom.HTMLOListElement
import org.w3c.dom.HTMLObjectElement
import org.w3c.dom.HTMLOptGroupElement
import org.w3c.dom.HTMLOptionElement
import org.w3c.dom.HTMLOutputElement
import org.w3c.dom.HTMLParagraphElement
import org.w3c.dom.HTMLParamElement
import org.w3c.dom.HTMLPictureElement
import org.w3c.dom.HTMLPreElement
import org.w3c.dom.HTMLProgressElement
import org.w3c.dom.HTMLSelectElement
import org.w3c.dom.HTMLSourceElement
import org.w3c.dom.HTMLSpanElement
import org.w3c.dom.HTMLTableCaptionElement
import org.w3c.dom.HTMLTableCellElement
import org.w3c.dom.HTMLTableColElement
import org.w3c.dom.HTMLTableElement
import org.w3c.dom.HTMLTableRowElement
import org.w3c.dom.HTMLTableSectionElement
import org.w3c.dom.HTMLTextAreaElement
import org.w3c.dom.HTMLTrackElement
import org.w3c.dom.HTMLUListElement
import org.w3c.dom.HTMLVideoElement
import org.w3c.dom.Text

typealias AttrBuilderContext<T> = AttrsBuilder<T>.() -> Unit
typealias ContentBuilder<T> = @Composable ElementScope<T>.() -> Unit

@Composable
fun Address(
    attrs: AttrBuilderContext<HTMLElement> = {},
    content: ContentBuilder<HTMLElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Address,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Article(
    attrs: AttrBuilderContext<HTMLElement> = {},
    content: ContentBuilder<HTMLElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Article,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Aside(
    attrs: AttrBuilderContext<HTMLElement> = {},
    content: ContentBuilder<HTMLElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Aside,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Header(
    attrs: AttrBuilderContext<HTMLElement> = {},
    content: ContentBuilder<HTMLElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Header,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Area(
    attrs: AttrBuilderContext<HTMLAreaElement> = {},
    content: ContentBuilder<HTMLAreaElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Area,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Audio(
    attrs: AttrBuilderContext<HTMLAudioElement> = {},
    content: ContentBuilder<HTMLAudioElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Audio,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun HTMLMap(
    attrs: AttrBuilderContext<HTMLMapElement> = {},
    content: ContentBuilder<HTMLMapElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Map,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Track(
    attrs: AttrBuilderContext<HTMLTrackElement> = {},
    content: ContentBuilder<HTMLTrackElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Track,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Video(
    attrs: AttrBuilderContext<HTMLVideoElement> = {},
    content: ContentBuilder<HTMLVideoElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Video,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Datalist(
    attrs: AttrBuilderContext<HTMLDataListElement> = {},
    content: ContentBuilder<HTMLDataListElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Datalist,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Fieldset(
    attrs: AttrBuilderContext<HTMLFieldSetElement> = {},
    content: ContentBuilder<HTMLFieldSetElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Fieldset,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Legend(
    attrs: AttrBuilderContext<HTMLLegendElement> = {},
    content: ContentBuilder<HTMLLegendElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Legend,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Meter(
    attrs: AttrBuilderContext<HTMLMeterElement> = {},
    content: ContentBuilder<HTMLMeterElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Meter,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Output(
    attrs: AttrBuilderContext<HTMLOutputElement> = {},
    content: ContentBuilder<HTMLOutputElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Output,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Progress(
    attrs: AttrBuilderContext<HTMLProgressElement> = {},
    content: ContentBuilder<HTMLProgressElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Progress,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Embed(
    attrs: AttrBuilderContext<HTMLEmbedElement> = {},
    content: ContentBuilder<HTMLEmbedElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Embed,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Iframe(
    attrs: AttrBuilderContext<HTMLIFrameElement> = {},
    content: ContentBuilder<HTMLIFrameElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Iframe,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Object(
    attrs: AttrBuilderContext<HTMLObjectElement> = {},
    content: ContentBuilder<HTMLObjectElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Object,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Param(
    attrs: AttrBuilderContext<HTMLParamElement> = {},
    content: ContentBuilder<HTMLParamElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Param,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Picture(
    attrs: AttrBuilderContext<HTMLPictureElement> = {},
    content: ContentBuilder<HTMLPictureElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Picture,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Source(
    attrs: AttrBuilderContext<HTMLSourceElement> = {},
    content: ContentBuilder<HTMLSourceElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Source,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Text(value: String) {
    ComposeNode<DomNodeWrapper, DomApplier>(
        factory = { DomNodeWrapper(document.createTextNode("")) },
        update = {
            set(value) { value -> (node as Text).data = value }
        },
    )
}

@Composable
fun Div(
    attrs: AttrBuilderContext<HTMLDivElement> = {},
    content: ContentBuilder<HTMLDivElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Div,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun A(
    href: String? = null,
    attrs: AttrBuilderContext<HTMLAnchorElement> = {},
    content: ContentBuilder<HTMLAnchorElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.A,
        applyAttrs = {
            if (href != null) {
                this.href(href)
            }
            attrs()
        },
        content = content
    )
}

@Composable
fun Input(
    type: InputType = InputType.Text,
    value: String = "",
    attrs: AttrBuilderContext<HTMLInputElement> = {}
) {
    TagElement(
        elementBuilder = ElementBuilder.Input,
        applyAttrs = {
            type(type)
            value(value)
            attrs()
        },
        content = null
    )
}

@Composable
fun Button(
    attrs: AttrBuilderContext<HTMLButtonElement> = {},
    content: ContentBuilder<HTMLButtonElement>? = null
) = TagElement(elementBuilder = ElementBuilder.Button, applyAttrs = attrs, content = content)

@Composable
fun H1(
    attrs: AttrBuilderContext<HTMLHeadingElement> = {},
    content: ContentBuilder<HTMLHeadingElement>? = null
) = TagElement(elementBuilder = ElementBuilder.H1, applyAttrs = attrs, content = content)

@Composable
fun H2(
    attrs: AttrBuilderContext<HTMLHeadingElement> = {},
    content: ContentBuilder<HTMLHeadingElement>? = null
) = TagElement(elementBuilder = ElementBuilder.H2, applyAttrs = attrs, content = content)

@Composable
fun H3(
    attrs: AttrBuilderContext<HTMLHeadingElement> = {},
    content: ContentBuilder<HTMLHeadingElement>? = null
) = TagElement(elementBuilder = ElementBuilder.H3, applyAttrs = attrs, content = content)

@Composable
fun H4(
    attrs: AttrBuilderContext<HTMLHeadingElement> = {},
    content: ContentBuilder<HTMLHeadingElement>? = null
) = TagElement(elementBuilder = ElementBuilder.H4, applyAttrs = attrs, content = content)

@Composable
fun H5(
    attrs: AttrBuilderContext<HTMLHeadingElement> = {},
    content: ContentBuilder<HTMLHeadingElement>? = null
) = TagElement(elementBuilder = ElementBuilder.H5, applyAttrs = attrs, content = content)

@Composable
fun H6(
    attrs: AttrBuilderContext<HTMLHeadingElement> = {},
    content: ContentBuilder<HTMLHeadingElement>? = null
) = TagElement(elementBuilder = ElementBuilder.H6, applyAttrs = attrs, content = content)

@Composable
fun P(
    attrs: AttrBuilderContext<HTMLParagraphElement> = {},
    content: ContentBuilder<HTMLParagraphElement>? = null
) = TagElement(elementBuilder = ElementBuilder.P, applyAttrs = attrs, content = content)

@Composable
fun Em(
    attrs: AttrBuilderContext<HTMLElement> = {},
    content: ContentBuilder<HTMLElement>? = null
) = TagElement(elementBuilder = ElementBuilder.Em, applyAttrs = attrs, content = content)

@Composable
fun I(
    attrs: AttrBuilderContext<HTMLElement> = {},
    content: ContentBuilder<HTMLElement>? = null
) = TagElement(elementBuilder = ElementBuilder.I, applyAttrs = attrs, content = content)

@Composable
fun B(
    attrs: AttrBuilderContext<HTMLElement> = {},
    content: ContentBuilder<HTMLElement>? = null
) = TagElement(elementBuilder = ElementBuilder.B, applyAttrs = attrs, content = content)

@Composable
fun Small(
    attrs: AttrBuilderContext<HTMLElement> = {},
    content: ContentBuilder<HTMLElement>? = null
) = TagElement(elementBuilder = ElementBuilder.Small, applyAttrs = attrs, content = content)

@Composable
fun Span(
    attrs: AttrBuilderContext<HTMLSpanElement> = {},
    content: ContentBuilder<HTMLSpanElement>? = null
) = TagElement(elementBuilder = ElementBuilder.Span, applyAttrs = attrs, content = content)

@Composable
fun Br(attrs: AttrBuilderContext<HTMLBRElement> = {}) =
    TagElement(elementBuilder = ElementBuilder.Br, applyAttrs = attrs, content = null)

@Composable
fun Ul(
    attrs: AttrBuilderContext<HTMLUListElement> = {},
    content: ContentBuilder<HTMLUListElement>? = null
) = TagElement(elementBuilder = ElementBuilder.Ul, applyAttrs = attrs, content = content)

@Composable
fun Ol(
    attrs: AttrBuilderContext<HTMLOListElement> = {},
    content: ContentBuilder<HTMLOListElement>? = null
) = TagElement(elementBuilder = ElementBuilder.Ol, applyAttrs = attrs, content = content)

@Composable
fun DOMScope<HTMLOListElement>.Li(
    attrs: AttrBuilderContext<HTMLLIElement> = {},
    content: ContentBuilder<HTMLLIElement>? = null
) = TagElement(elementBuilder = ElementBuilder.Li, applyAttrs = attrs, content = content)

@Composable
fun DOMScope<HTMLUListElement>.Li(
    attrs: AttrBuilderContext<HTMLLIElement> = {},
    content: ContentBuilder<HTMLLIElement>? = null
) = TagElement(elementBuilder = ElementBuilder.Li, applyAttrs = attrs, content = content)

@Composable
fun Img(
    src: String,
    alt: String = "",
    attrs: AttrBuilderContext<HTMLImageElement> = {}
) = TagElement(
    elementBuilder = ElementBuilder.Img,
    applyAttrs = {
        src(src).alt(alt)
        attrs()
    },
    content = null
)

@Composable
fun Form(
    action: String? = null,
    attrs: AttrBuilderContext<HTMLFormElement> = {},
    content: ContentBuilder<HTMLFormElement>? = null
) = TagElement(
    elementBuilder = ElementBuilder.Form,
    applyAttrs = {
        if (!action.isNullOrEmpty()) action(action)
        attrs()
    },
    content = content
)

@Composable
fun Select(
    attrs: AttrBuilderContext<HTMLSelectElement> = {},
    content: ContentBuilder<HTMLSelectElement>? = null
) = TagElement(
    elementBuilder = ElementBuilder.Select,
    applyAttrs = attrs,
    content = content
)

@Composable
fun Option(
    value: String,
    attrs: AttrBuilderContext<HTMLOptionElement> = {},
    content: ContentBuilder<HTMLOptionElement>? = null
) = TagElement(
    elementBuilder = ElementBuilder.Option,
    applyAttrs = {
        value(value)
        attrs()
    },
    content = content
)

@Composable
fun OptGroup(
    label: String,
    attrs: AttrBuilderContext<HTMLOptGroupElement> = {},
    content: ContentBuilder<HTMLOptGroupElement>? = null
) = TagElement(
    elementBuilder = ElementBuilder.OptGroup,
    applyAttrs = {
        label(label)
        attrs()
    },
    content = content
)

@Composable
fun Section(
    attrs: AttrBuilderContext<HTMLElement> = {},
    content: ContentBuilder<HTMLElement>? = null
) = TagElement(
    elementBuilder = ElementBuilder.Section,
    applyAttrs = attrs,
    content = content
)

@Composable
fun TextArea(
    attrs: AttrBuilderContext<HTMLTextAreaElement> = {},
    value: String
) = TagElement(
    elementBuilder = ElementBuilder.TextArea,
    applyAttrs = {
        value(value)
        attrs()
    }
) {
    Text(value)
}

@Composable
fun Nav(
    attrs: AttrBuilderContext<HTMLElement> = {},
    content: ContentBuilder<HTMLElement>? = null
) = TagElement(
    elementBuilder = ElementBuilder.Nav,
    applyAttrs = attrs,
    content = content
)

@Composable
fun Pre(
    attrs: AttrBuilderContext<HTMLPreElement> = {},
    content: ContentBuilder<HTMLPreElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Pre,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Code(
    attrs: AttrBuilderContext<HTMLElement> = {},
    content: ContentBuilder<HTMLElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Code,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Main(
    attrs: AttrBuilderContext<HTMLElement> = {},
    content: ContentBuilder<HTMLElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Main,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Footer(
    attrs: AttrBuilderContext<HTMLElement> = {},
    content: ContentBuilder<HTMLElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Footer,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Hr(
    attrs: AttrBuilderContext<HTMLHRElement> = {}
) {
    TagElement(
        elementBuilder = ElementBuilder.Hr,
        applyAttrs = attrs,
        content = null
    )
}

@Composable
fun Label(
    forId: String? = null,
    attrs: AttrBuilderContext<HTMLLabelElement> = {},
    content: ContentBuilder<HTMLLabelElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Label,
        applyAttrs = {
            if (forId != null) {
                forId(forId)
            }
            attrs()
        },
        content = content
    )
}

@Composable
fun Table(
    attrs: AttrBuilderContext<HTMLTableElement> = {},
    content: ContentBuilder<HTMLTableElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Table,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Caption(
    attrs: AttrBuilderContext<HTMLTableCaptionElement> = {},
    content: ContentBuilder<HTMLTableCaptionElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Caption,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Col(
    attrs: AttrBuilderContext<HTMLTableColElement> = {}
) {
    TagElement(
        elementBuilder = ElementBuilder.Col,
        applyAttrs = attrs,
        content = null
    )
}

@Composable
fun Colgroup(
    attrs: AttrBuilderContext<HTMLTableColElement> = {},
    content: ContentBuilder<HTMLTableColElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Colgroup,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Tr(
    attrs: AttrBuilderContext<HTMLTableRowElement> = {},
    content: ContentBuilder<HTMLTableRowElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Tr,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Thead(
    attrs: AttrBuilderContext<HTMLTableSectionElement> = {},
    content: ContentBuilder<HTMLTableSectionElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Thead,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Th(
    attrs: AttrBuilderContext<HTMLTableCellElement> = {},
    content: ContentBuilder<HTMLTableCellElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Th,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Td(
    attrs: AttrBuilderContext<HTMLTableCellElement> = {},
    content: ContentBuilder<HTMLTableCellElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Td,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Tbody(
    attrs: AttrBuilderContext<HTMLTableSectionElement> = {},
    content: ContentBuilder<HTMLTableSectionElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Tbody,
        applyAttrs = attrs,
        content = content
    )
}

@Composable
fun Tfoot(
    attrs: AttrBuilderContext<HTMLTableSectionElement> = {},
    content: ContentBuilder<HTMLTableSectionElement>? = null
) {
    TagElement(
        elementBuilder = ElementBuilder.Tfoot,
        applyAttrs = attrs,
        content = content
    )
}
