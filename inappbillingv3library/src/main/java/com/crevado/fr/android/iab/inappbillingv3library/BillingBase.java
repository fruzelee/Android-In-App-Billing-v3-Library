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

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Fazle Rabbi on 5/23/2020.
 * fazle.rabbi.cse@gmail.com
 */
class BillingBase
{
	private Context context;

	BillingBase(Context context)
	{
		this.context = context;
	}

	Context getContext()
	{
		return context;
	}

	String getPreferencesBaseKey()
	{
		return getContext().getPackageName() + "_preferences";
	}

	private SharedPreferences getPreferences()
	{
		return PreferenceManager.getDefaultSharedPreferences(getContext());
	}

	boolean saveString(String key, String value)
	{
		SharedPreferences sp = getPreferences();
		if (sp != null)
		{
			SharedPreferences.Editor spe = sp.edit();
			spe.putString(key, value);
			spe.commit();
			return true;
		}
		return false;
	}

	String loadString(String key, String defValue)
	{
		SharedPreferences sp = getPreferences();
		if (sp != null)
		{
			return sp.getString(key, defValue);
		}
		return defValue;
	}

	boolean saveBoolean(String key, Boolean value)
	{
		SharedPreferences sp = getPreferences();
		if (sp != null)
		{
			SharedPreferences.Editor spe = sp.edit();
			spe.putBoolean(key, value);
			spe.commit();
			return true;
		}
		return false;
	}

	boolean loadBoolean(String key, boolean defValue)
	{
		SharedPreferences sp = getPreferences();
		if (sp != null)
		{
			return sp.getBoolean(key, defValue);
		}
		return defValue;
	}
}

