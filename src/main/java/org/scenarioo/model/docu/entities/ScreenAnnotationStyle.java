package org.scenarioo.model.docu.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * Predefined styles that can be used with screen annotations.
 * 
 * A style defines in what style the annotated screen region is highlighted.
 */
@XmlEnum
public enum ScreenAnnotationStyle {
	
	/**
	 * Style to visualize a click event, when the user clicked on an element to select something
	 */
	@XmlEnumValue(value = "click")
	CLICK,
	
	/**
	 * Style to visualize a keyboard event, when the user typed something inside an element
	 */
	@XmlEnumValue(value = "keyboard")
	KEYBOARD,
	
	/**
	 * Style to mark a field or ui element as having the expected content or state because it was inspected by the test
	 * (e.g. when content of a text box is inspected for containing the expected content)
	 */
	@XmlEnumValue(value = "expected")
	EXPECTED,
	
	/**
	 * Style to visualize that the user entered a different URL inside the browser navigation bar
	 */
	@XmlEnumValue(value = "navigateToUrl")
	NAVIGATE_TO_URL,
	
	/**
	 * Generic error style:
	 * For any annotation that marks something unexpected (e.g. a validation that failed or an event that failed or an exception that occured)
	 */
	@XmlEnumValue(value = "error")
	ERROR,
	
	/**
	 * Generic warning style, for arbitrary warning annotations
	 */
	@XmlEnumValue(value = "warn")
	WARN,
	
	/**
	 * Generic info style: for any additional information message on the screen (e.g. useful for captions, subtitles and other informations)
	 */
	@XmlEnumValue(value = "info")
	INFO,
		
	/**
	 * Generic highlight style to highlight special regions in the UI that are important in this step
	 */
	@XmlEnumValue(value = "highlight")
	HIGHLIGHT,
	
	/**
	 * Generic default style that has no special meanings. This style is the most soft style in no special color (grayed out). This style is useful to simply attach additional informations to specific UI elements (e.g. like dropdown items in a dropdown selection box).
	 */
	@XmlEnumValue(value = "default")
	DEFAULT;

}
