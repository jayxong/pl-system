package com.yeanson.ddd.domain.order.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ord_item", schema = "customerorder", catalog = "")
@Data
@Setter(AccessLevel.PRIVATE)
public class OrderItemEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ord_item_id")
    private long ordItemId;
    @Basic
    @Column(name = "ord_cust_id")
    private Long ordCustId;
    @Basic
    @Column(name = "ord_item_type")
    private String ordItemType;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "create_op_id")
    private Long createOpId;
    @Basic
    @Column(name = "create_org_id")
    private Long createOrgId;
    @Basic
    @Column(name = "op_id")
    private Long opId;
    @Basic
    @Column(name = "org_id")
    private Long orgId;
    @Basic
    @Column(name = "done_code")
    private Long doneCode;
    @Basic
    @Column(name = "create_date")
    private Timestamp createDate;
    @Basic
    @Column(name = "done_date")
    private Timestamp doneDate;
    @Basic
    @Column(name = "effective_date")
    private Timestamp effectiveDate;
    @Basic
    @Column(name = "expire_date")
    private Timestamp expireDate;
    @Basic
    @Column(name = "region_id")
    private String regionId;
    @Basic
    @Column(name = "remarks")
    private String remarks;
    @Basic
    @Column(name = "intact_item_id")
    private Long intactItemId;
    @Basic
    @Column(name = "state")
    private String state;
    @Basic
    @Column(name = "is_send")
    private String isSend;
    @Basic
    @Column(name = "out_oid")
    private String outOid;


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderItemEntity that = (OrderItemEntity) o;
        return ordItemId == that.ordItemId && Objects.equals(ordCustId, that.ordCustId) && Objects.equals(ordItemType, that.ordItemType) && Objects.equals(status, that.status) && Objects.equals(createOpId, that.createOpId) && Objects.equals(createOrgId, that.createOrgId) && Objects.equals(opId, that.opId) && Objects.equals(orgId, that.orgId) && Objects.equals(doneCode, that.doneCode) && Objects.equals(createDate, that.createDate) && Objects.equals(doneDate, that.doneDate) && Objects.equals(effectiveDate, that.effectiveDate) && Objects.equals(expireDate, that.expireDate) && Objects.equals(regionId, that.regionId) && Objects.equals(remarks, that.remarks) && Objects.equals(intactItemId, that.intactItemId) && Objects.equals(state, that.state) && Objects.equals(isSend, that.isSend) && Objects.equals(outOid, that.outOid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordItemId, ordCustId, ordItemType, status, createOpId, createOrgId, opId, orgId, doneCode, createDate, doneDate, effectiveDate, expireDate, regionId, remarks, intactItemId, state, isSend, outOid);
    }
}
