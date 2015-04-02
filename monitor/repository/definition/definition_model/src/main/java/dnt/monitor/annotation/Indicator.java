/**
 * Developer: Kadvin Date: 14/12/25 下午2:40
 */
package dnt.monitor.annotation;

import java.lang.annotation.*;

/**
 * <h1>指标</h1>
 *
 * 指标的核心定义为： 其数据直接来自于特定被管理(采集)的对象
 *
 * <code>@Indicator</code>可以标记在普通的属性上，或者结构体(entry)上
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
@Inherited
public @interface Indicator {
    /**
     * <h2>关键指标</h2>
     *
     * 关键指标意味着默认采集
     *
     * @return 是否关键，默认为true
     */
    boolean key() default true;

    //单位
    String unit() default "";
}