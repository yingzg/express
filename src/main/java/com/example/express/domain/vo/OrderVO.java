package com.example.express.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author jitwxs
 * @date 2019年04月24日 22:24
 */
@Data
@Builder
public class OrderVO implements Serializable {
    /**
     * 订单号
     */
    private String id;
    /**
     * 快递单号
     */
    private String odd;
    /**
     * 快递公司
     */
    private String company;
    /**
     * 取件名
     */
    private String name;
    /**
     * 取件号码
     */
    private String tel;
    /**
     * 支付状态
     */
    private Integer paymentStatus;
    /**
     * 订单状态
     */
    private Integer orderStatus;
    /**
     * 下单时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createDate;
}
