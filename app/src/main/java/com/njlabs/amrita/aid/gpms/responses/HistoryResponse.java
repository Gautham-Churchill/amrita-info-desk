/*
 * Copyright (c) 2016. Niranjan Rajendran <niranjan94@yahoo.com>
 */

package com.njlabs.amrita.aid.gpms.responses;

import com.njlabs.amrita.aid.gpms.models.HistoryEntry;

import java.util.List;

public abstract class HistoryResponse {
    public abstract void onSuccess(List<HistoryEntry> historyEntries);
    public abstract void onFailure(String response, Throwable throwable);
}
