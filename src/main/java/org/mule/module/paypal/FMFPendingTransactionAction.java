/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.module.paypal;

import ebay.api.paypal.FMFPendingTransactionActionType;

/**
 * Mule-Devkit-friendly mirror of {@link FMFPendingTransactionActionType} that is not
 * annotated with Jaxb, in order to avoid code generation errors
 * 
 * @author flbulgarelli
 */
public enum FMFPendingTransactionAction
{
    ACCEPT, DENY;
    public FMFPendingTransactionActionType toPaypalType()

    {
        return Enums.translate(this, FMFPendingTransactionActionType.class);
    }
}
