package com.baize.grainmall.member.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("grainmall-coupon")
public interface CouponFeignService {
}
