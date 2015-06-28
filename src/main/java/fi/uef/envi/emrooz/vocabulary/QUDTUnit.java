/*
 * Copyright (C) 2015 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.emrooz.vocabulary;

import org.openrdf.model.URI;

/**
 * <p>
 * Title: QUDTUnit
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

public class QUDTUnit extends AbstractVocabulary {
	
	public static final URI ns = _("http://qudt.org/vocab/unit"); 
	
	static {
		AbstractVocabulary.ns = ns.stringValue();
	}
	
	/** http://qudt.org/vocab/unit#Hertz */
	public static final URI Hertz = _("Hertz");
	
}
