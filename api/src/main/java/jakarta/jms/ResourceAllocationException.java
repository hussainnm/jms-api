/*
 * Copyright (c) 1997, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package jakarta.jms;

/**
 * This exception is thrown when a provider is unable to allocate the resources required by a method.
 *
 * <p>
 * For example, this exception should be thrown when a call to {@code TopicConnectionFactory.createTopicConnection}
 * fails due to a lack of Jakarta Messaging provider resources.
 *
 * @version Jakarta Messaging 2.0
 * @since JMS 1.0
 **/
public class ResourceAllocationException extends JMSException {

    /**
     * Explicitly set serialVersionUID to be the same as the implicit serialVersionUID of the Java Message Service 1.1 version
     */
    private static final long serialVersionUID = -1172695755360706776L;

    /**
     * Constructs a {@code ResourceAllocationException} with the specified reason and error code.
     *
     * @param reason a description of the exception
     * @param errorCode a string specifying the vendor-specific error code
     *
     **/
    public ResourceAllocationException(String reason, String errorCode) {
        super(reason, errorCode);
    }

    /**
     * Constructs a {@code ResourceAllocationException} with the specified reason. The error code defaults to null.
     *
     * @param reason a description of the exception
     **/
    public ResourceAllocationException(String reason) {
        super(reason);
    }

}
