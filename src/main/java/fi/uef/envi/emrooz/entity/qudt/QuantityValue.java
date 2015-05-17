/*
 * Copyright (C) 2015 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.emrooz.entity.qudt;

import org.openrdf.model.URI;

import fi.uef.envi.emrooz.entity.AbstractEntity;
import fi.uef.envi.emrooz.entity.EntityVisitor;
import fi.uef.envi.emrooz.vocabulary.QUDTSchema;

/**
 * <p>
 * Title: QuantityValue
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

public class QuantityValue extends AbstractEntity {

	public Double value;
	public Unit unit;

	public QuantityValue(URI id) {
		this(id, QUDTSchema.QuantityValue, null, null);
	}

	public QuantityValue(URI id, Double value, Unit unit) {
		this(id, QUDTSchema.QuantityValue, value, unit);
	}

	public QuantityValue(URI id, URI type, Double value, Unit unit) {
		super(id, type);

		setNumericValue(value);
		setUnit(unit);
	}

	public void setNumericValue(Double value) {
		this.value = value;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public Double getNumericValue() {
		return value;
	}

	public Unit getUnit() {
		return unit;
	}

	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public int hashCode() {
		return 31 * (id.hashCode() + type.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Unit))
			return false;

		QuantityValue other = (QuantityValue) obj;

		if (other.id.equals(id) && other.type.equals(type))
			return true;

		return false;
	}

	@Override
	public String toString() {
		return "QuantityValue [id = " + id + "; type = " + type + "; value = "
				+ value + "; unit = " + unit + "]";
	}

}
