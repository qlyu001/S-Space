/*
 * Copyright 2009 Keith Stevens 
 *
 * This file is part of the S-Space package and is covered under the terms and
 * conditions therein.
 *
 * The S-Space package is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as published
 * by the Free Software Foundation and distributed hereunder to you.
 *
 * THIS SOFTWARE IS PROVIDED "AS IS" AND NO REPRESENTATIONS OR WARRANTIES,
 * EXPRESS OR IMPLIED ARE MADE.  BY WAY OF EXAMPLE, BUT NOT LIMITATION, WE MAKE
 * NO REPRESENTATIONS OR WARRANTIES OF MERCHANT- ABILITY OR FITNESS FOR ANY
 * PARTICULAR PURPOSE OR THAT THE USE OF THE LICENSED SOFTWARE OR DOCUMENTATION
 * WILL NOT INFRINGE ANY THIRD PARTY PATENTS, COPYRIGHTS, TRADEMARKS OR OTHER
 * RIGHTS.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package edu.ucla.sspace.text;

import org.tartarus.snowball.ext.englishStemmer;

/**
 * A wrapper for the english <a href="http://snowball.tartarus.org/">Snowball
 * Stemmer</a>.  Details for this specific stemmer can be found at <a
 * href="http://snowball.tartarus.org/algorithms/english/stemmer.html">here</a>.
 *
 * @author Keith Stevens.
 */
public class EnglishStemmer implements Stemmer{

    /**
     * {@inheritDoc}
     */
    public String stem(String token) {
        englishStemmer stemmer = new englishStemmer();
        stemmer.setCurrent(token);
        stemmer.stem();
        return stemmer.getCurrent();
    }
}
