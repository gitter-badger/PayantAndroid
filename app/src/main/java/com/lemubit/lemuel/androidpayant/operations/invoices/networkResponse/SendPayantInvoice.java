package com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse;

import com.lemubit.lemuel.androidpayant.utils.StatusString;

/**
 * @author lemuel
 */
public class SendPayantInvoice {
    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Boolean isSuccessful() {
        return status.equals(StatusString.PASSED);
    }

    @Override
    public String toString() {
        return "SendPayantInvoice{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
