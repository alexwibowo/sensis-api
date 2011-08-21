package org.isolution.sensis.domain;

import java.util.List;

/**
 * User: Alex Wibowo
 * Date: 19/08/11
 * Time: 9:54 PM
 */
public class OperatingHour {
    /**
     * <ul>
     *     <li>open: The business is open. There will be at least one period in the times property to indicate the exact hours they are open for.</li>
     *     <li>closed: The business is closed all day. There will be no times property.</li>
     *     <li>byAppointment: 	The business is only open for pre-arranged appointments. There will be no times property.</li>
     *     <li>24hours: The business is open all day. There will be no times property.</li>
     * </ul>
     */
    private String status;

    /**
     * Zero or more periods during which the business is open.
     * @see OperatingHourTime
     */
    private List<OperatingHourTime> times;

    public OperatingHour() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OperatingHourTime> getTimes() {
        return times;
    }

    public void setTimes(List<OperatingHourTime> times) {
        this.times = times;
    }

    public static class OperatingHourTime{
        /**
         * When the business opens. Format is hh:mm, in 24-hour time.
         */
        private String open;

        /**
         * When the business closes. Format is hh:mm, in 24-hour time.
         */
        private String close;

        public String getOpen() {
            return open;
        }

        public void setOpen(String open) {
            this.open = open;
        }

        public String getClose() {
            return close;
        }

        public void setClose(String close) {
            this.close = close;
        }
    }
}
