package com.atguigu.gmall.item.vo;

import lombok.Data;

import java.util.List;

@Data
public class ItemGroupVo {

    private String groupName;

    private List<AttrValueVo> attrs;

}
