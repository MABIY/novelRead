package com.lh.base.spring.domain.respository;

/**
 * Created by lh on 17-2-22.
 */
public interface CrudRepository<T,F> {

    /**
     *   发现数据
     * @param f
     * @return
     */
    T find(F f);

    /**
     * 删除数据
     * @param f
     */
    void delete(F f);


    /**
     * 保存数据(include 软删除,通过T 是否有id 判断 是insert  or update)
     * @param t
     * @return
     */
    int save(T t);

}
