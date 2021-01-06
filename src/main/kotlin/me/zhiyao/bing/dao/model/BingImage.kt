package me.zhiyao.bing.dao.model

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId

/**
 *
 * @author WangZhiYao
 * @date 2020/12/22
 */
data class BingImage(
    @TableId(type = IdType.AUTO)
    var id: Long?,
    val year: Int,
    val month: Int,
    val day: Int,
    val copyright: String?,
    val title: String?,
    val description: String?,
    val location: String?,
    val image: String
)
