/*******************************************************************************
 * Copyright 2015 McGill University. All rights reserved.                       
 *                                                                               
 * Unless required by applicable law or agreed to in writing, the software      
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF      
 * ANY KIND, either express or implied.                                         
 *******************************************************************************/
package ca.mcgill.sis.dmas.nlp.corpus;

import java.util.Iterator;

import com.google.common.collect.Iterables;


public class ParagraphsTaggedSkip extends ParagraphsTagged {

	Iterable<ParagraphTagged> iterable;
	public ParagraphsTaggedSkip(ParagraphsTagged paragraphs, int numberToSkip) {
		iterable = Iterables.skip(paragraphs, numberToSkip);
	}
	
	@Override
	public Iterator<ParagraphTagged> iterator() {
		return iterable.iterator();
	}

}
