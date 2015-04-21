/*
 * Copyright (C) 2015 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.emrooz.api.ssn;

import org.openrdf.model.URI;

import fi.uef.envi.emrooz.api.AbstractEntity;
import fi.uef.envi.emrooz.vocabulary.SSN;

/**
 * <p>
 * Title: Property
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Project: Emrooz
 * </p>
 * <p>
 * Copyright: Copyright (C) 2015
 * </p>
 * 
 * @author Markus Stocker
 */

public class Property extends AbstractEntity {

	public Property(URI id) {
		this(id, SSN.Property);
	}

	public Property(URI id, URI type) {
		super(id, type);
	}

	public int hashCode() {
		return 31 * (id.hashCode() + type.hashCode());
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Property))
			return false;

		Property other = (Property) obj;

		if (other.id.equals(id) && other.type.equals(type))
			return true;

		return false;
	}

}