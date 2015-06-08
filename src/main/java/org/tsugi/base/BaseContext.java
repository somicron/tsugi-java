
package org.tsugi.base;

import org.tsugi.Context;

/**
 * This is a class to provide access to the resource context level data.
 *
 * This data comes from the LTI launch from the LMS. 
 * A context is the equivalent of a "class" or course.   A context
 * has a roster of users and each user has a role within the context.
 * A launch may or may not contain a context.  If there
 * is a link without a context, it is a "system-wide" link
 * like "view profile" or "show all courses"
 *
 */

public abstract class BaseContext implements Context {

    // TODO: - $Context->lang - The context language choice.

    public Long id;
    public String title;

    /**
     * The integer primary key for this context in the 'lti_context' table.
     */
    public Long getId()
    {
        return id;
    }

    /**
     * The context title
     */
    public String getTitle()
    {
        return title;
    }

}
