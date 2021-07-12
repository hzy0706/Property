package com.trkj.property.vo.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TCostitemQueryForm implements Serializable {

        private Integer ctId;

        private Integer residenceId;

        private String ctName;

        private Integer ctChargecycle;

        private BigDecimal ctSubtotal;

        private Integer overdue;

        private String overduefine;

        private String ctRelation;

        private String chco;

        private String ifprice;

        private static final long serialVersionUID = 1L;
        private Integer pageNum;    //当前页
        private Integer pageSize;   //页大小

        public Integer getPageNum() {
            if (pageNum == null)
                return 1;
            return pageNum;
        }

        public Integer getPageSize() {
            if (pageSize == null)
                return 0;
            return pageSize;
        }
}
