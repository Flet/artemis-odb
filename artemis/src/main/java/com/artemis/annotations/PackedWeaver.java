package com.artemis.annotations;

import com.artemis.Component;
import com.artemis.PooledComponent;

/**
 * Transforms a {@link Component} into a {@link PooledComponent}. Component transformation
 * takes place during the <code>artemis</code> goal defined in <code>artemis-odb-maven-plugin</code>.
 * 
 * @see <a href="https://github.com/junkdog/artemis-odb/wiki/Component%20Types">Component types</a>
 *      on the wiki.
 */
public @interface PackedWeaver {}
