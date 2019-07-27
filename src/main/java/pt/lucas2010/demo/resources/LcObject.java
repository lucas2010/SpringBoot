package pt.lucas2010.demo.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;


public class LcObject {
    private String trace_number;
    private String product_code;
    private String product_desc;
    private String dest_name_1;
    private String dest_name_2;
    private String dest_address_1;
    private String dest_address_2;
    private String dest_address_pc;
    private String sender_name_1;
    private String sender_name_2;
    private String sender_address_1;
    private String sender_address_2;
    private String status;
    private String created_by;
    private Instant created_at;
    private String last_modified_by;
    private Instant last_modified_at;


    @JsonProperty
    public String getTraceNumber() {
        return trace_number;
    }

    public void setTraceNumber(String trace_number) {
        this.trace_number = trace_number;
    }

    @JsonProperty
    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    @JsonProperty
    public String getProduct_desc() {
        return product_desc;
    }

    public void setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
    }

    @JsonProperty
    public String getDest_name_1() {
        return dest_name_1;
    }

    public void setDest_name_1(String dest_name_1) {
        this.dest_name_1 = dest_name_1;
    }

    @JsonProperty
    public String getDest_name_2() {
        return dest_name_2;
    }

    public void setDest_name_2(String dest_name_2) {
        this.dest_name_2 = dest_name_2;
    }

    @JsonProperty
    public String getDest_address_1() {
        return dest_address_1;
    }

    public void setDest_address_1(String dest_address_1) {
        this.dest_address_1 = dest_address_1;
    }

    @JsonProperty
    public String getDest_address_2() {
        return dest_address_2;
    }

    public void setDest_address_2(String dest_address_2) {
        this.dest_address_2 = dest_address_2;
    }

    @JsonProperty
    public String getDest_address_pc() {
        return dest_address_pc;
    }

    public void setDest_address_pc(String dest_address_pc) {
        this.dest_address_pc = dest_address_pc;
    }

    @JsonProperty
    public String getSender_name_1() {
        return sender_name_1;
    }

    public void setSender_name_1(String sender_name_1) {
        this.sender_name_1 = sender_name_1;
    }

    @JsonProperty
    public String getSender_name_2() {
        return sender_name_2;
    }

    public void setSender_name_2(String sender_name_2) {
        this.sender_name_2 = sender_name_2;
    }

    @JsonProperty
    public String getSender_address_1() {
        return sender_address_1;
    }

    public void setSender_address_1(String sender_address_1) {
        this.sender_address_1 = sender_address_1;
    }

    @JsonProperty
    public String getSender_address_2() {
        return sender_address_2;
    }

    public void setSender_address_2(String sender_address_2) {
        this.sender_address_2 = sender_address_2;
    }

    @JsonProperty
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty
    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    @JsonProperty
    public Instant getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Instant created_at) {
        this.created_at = created_at;
    }

    @JsonProperty
    public String getLast_modified_by() {
        return last_modified_by;
    }

    public void setLast_modified_by(String last_modified_by) {
        this.last_modified_by = last_modified_by;
    }

    @JsonProperty
    public Instant getLast_modified_at() {
        return last_modified_at;
    }

    public void setLast_modified_at(Instant last_modified_at) {
        this.last_modified_at = last_modified_at;
    }
}
