/**
 * Copyright 2020 Fazle Rabbi
 * fazle.rabbi.cse@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.crevado.fr.android.iab.inappbillingv3library;
/**
 * Created by Fazle Rabbi on 5/23/2020.
 * fazle.rabbi.cse@gmail.com
 */
public class BillingCommunicationException extends Exception
{

    public BillingCommunicationException(Throwable cause)
    {
        super(cause);
    }

    public BillingCommunicationException(String message)
    {
        super(message);
    }
}
