package fr.ablanc.chargingPoint.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Record {

        @SerializedName("datasetid")
        @Expose
        private String datasetid;
        @SerializedName("recordid")
        @Expose
        private String recordid;
        @SerializedName("fields")
        @Expose
        private Fields fields;
        @SerializedName("geometry")
        @Expose
        private Geometry geometry;
        @SerializedName("record_timestamp")
        @Expose
        private String recordTimestamp;

        public String getDatasetid() {
            return datasetid;
        }

        public void setDatasetid(String datasetid) {
            this.datasetid = datasetid;
        }

        public String getRecordid() {
            return recordid;
        }

        public void setRecordid(String recordid) {
            this.recordid = recordid;
        }

        public Fields getFields() {
            return fields;
        }

        public void setFields(Fields fields) {
            this.fields = fields;
        }

        public Geometry getGeometry() {
            return geometry;
        }

        public void setGeometry(Geometry geometry) {
            this.geometry = geometry;
        }

        public String getRecordTimestamp() {
            return recordTimestamp;
        }

        public void setRecordTimestamp(String recordTimestamp) {
            this.recordTimestamp = recordTimestamp;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Record.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("datasetid");
            sb.append('=');
            sb.append(((this.datasetid == null)?"<null>":this.datasetid));
            sb.append(',');
            sb.append("recordid");
            sb.append('=');
            sb.append(((this.recordid == null)?"<null>":this.recordid));
            sb.append(',');
            sb.append("fields");
            sb.append('=');
            sb.append(((this.fields == null)?"<null>":this.fields));
            sb.append(',');
            sb.append("geometry");
            sb.append('=');
            sb.append(((this.geometry == null)?"<null>":this.geometry));
            sb.append(',');
            sb.append("recordTimestamp");
            sb.append('=');
            sb.append(((this.recordTimestamp == null)?"<null>":this.recordTimestamp));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }
}
