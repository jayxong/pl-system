package com.yeanson.ddd.domain.order.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author yeanson
 */
@Entity
@Table(name = "ord_cust", schema = "customerorder", catalog = "")
@Data
@Setter(AccessLevel.PRIVATE)
public class OrderEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ord_cust_id")
    private long ordCustId;
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
    @Column(name = "intact_id")
    private Long intactId;
    @Basic
    @Column(name = "state")
    private String state;
    @Basic
    @Column(name = "out_ord_id")
    private String outOrdId;
    @Basic
    @Column(name = "repository_id")
    private Long repositoryId;
    @Basic
    @Column(name = "total_fee")
    private BigDecimal totalFee;
    @Basic
    @Column(name = "payment_fee")
    private BigDecimal paymentFee;
    @Basic
    @Column(name = "discount_fee")
    private BigDecimal discountFee;
    @Basic
    @Column(name = "post_fee")
    private BigDecimal postFee;
    @Basic
    @Column(name = "ord_type")
    private String ordType;
    @Basic
    @Column(name = "os_status")
    private String osStatus;
    @Basic
    @Column(name = "trade_memo")
    private String tradeMemo;
    @Basic
    @Column(name = "plat_form")
    private String platForm;

    @JoinColumn(name = "ord_cust_id")
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<OrderItemEntity> orderItems = new ArrayList<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderEntity that = (OrderEntity) o;
        return ordCustId == that.ordCustId && Objects.equals(status, that.status) && Objects.equals(createOpId, that.createOpId) && Objects.equals(createOrgId, that.createOrgId) && Objects.equals(opId, that.opId) && Objects.equals(orgId, that.orgId) && Objects.equals(doneCode, that.doneCode) && Objects.equals(createDate, that.createDate) && Objects.equals(doneDate, that.doneDate) && Objects.equals(effectiveDate, that.effectiveDate) && Objects.equals(expireDate, that.expireDate) && Objects.equals(regionId, that.regionId) && Objects.equals(remarks, that.remarks) && Objects.equals(intactId, that.intactId) && Objects.equals(state, that.state) && Objects.equals(outOrdId, that.outOrdId) && Objects.equals(repositoryId, that.repositoryId) && Objects.equals(totalFee, that.totalFee) && Objects.equals(paymentFee, that.paymentFee) && Objects.equals(discountFee, that.discountFee) && Objects.equals(postFee, that.postFee) && Objects.equals(ordType, that.ordType) && Objects.equals(osStatus, that.osStatus) && Objects.equals(tradeMemo, that.tradeMemo) && Objects.equals(platForm, that.platForm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordCustId, status, createOpId, createOrgId, opId, orgId, doneCode, createDate, doneDate, effectiveDate, expireDate, regionId, remarks, intactId, state, outOrdId, repositoryId, totalFee, paymentFee, discountFee, postFee, ordType, osStatus, tradeMemo, platForm);
    }
}
