package org.scenarioo.model.docu.entities;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * TODO pforster: proto
 */
@XmlRootElement(name = "diffs")
@XmlAccessorType(XmlAccessType.FIELD)
public class DefaultDiffInfos {
	
	@XmlElement(name = "diffinfo")
	private Set<DefaultDiffInfo> diffs = new LinkedHashSet<DefaultDiffInfo>();

	/**
	 * @return the diffs
	 */
	public Set<DefaultDiffInfo> getDiffs() {
		return diffs;
	}

	/**
	 * @param diffs
	 *            the diffs to set
	 */
	public void setDiffs(final Set<DefaultDiffInfo> diffs) {
		this.diffs = diffs;
	}
	
}
