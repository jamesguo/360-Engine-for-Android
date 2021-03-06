/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the Common Development
 * and Distribution License (the "License").
 * You may not use this file except in compliance with the License.
 *
 * You can obtain a copy of the license at
 * src/com/vodafone360/people/VODAFONE.LICENSE.txt or
 * http://github.com/360/360-Engine-for-Android
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each file and
 * include the License file at src/com/vodafone360/people/VODAFONE.LICENSE.txt.
 * If applicable, add the following below this CDDL HEADER, with the fields
 * enclosed by brackets "[]" replaced with your own identifying information:
 * Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 *
 * Copyright 2010 Vodafone Sales & Services Ltd.  All rights reserved.
 * Use is subject to license terms.
 */

package com.vodafone360.people.service.aidl;

import com.vodafone360.people.engine.presence.User;

/***
 * Extra APIs, not present in the Engine interface.
 */
public interface ThirdPartyUtils {

    /**
     * Return user presence status.
     *
     * @param localContactId ID for contact.
     * @return User presence.
     */
    public User getUserPresenceStatusByLocalContactId(final long localContactId);
    
    /**
     * Return the ordinal of the given user's OnlineStatus
     * @param localContactID
     * @return The ordinal of the user's OnlineStatus:
     * <ol>
     * <li>Offline</li>
     * <li>Invisible</li>
     * <li>Idle</li>
     * <li>Online</li>
     * </ol>
     */
    public int getPresence(final long localContactID);
}