package org.computer.sbshoppingcart.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.computer.sbshoppingcart.entity.Account;
import org.computer.sbshoppingcart.model.UserInfo;
import org.computer.sbshoppingcart.pagination.PaginationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.query.Query;


@Transactional
@Repository
public class AccountDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Account findAccount(String userName) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.find(Account.class, userName);
    }


    public PaginationResult<UserInfo> queryUsers(int page,int maxResult,int maxNavigationPage)
    {
        String sql = "Select new " + UserInfo.class.getName() //
                + "(p.userName, p.active, p.userRole) " + " from "//
                + Account.class.getName() + " p ";

        //sql += " order by p.createDate desc ";


        Session session = this.sessionFactory.getCurrentSession();
        Query<UserInfo> query = session.createQuery(sql, UserInfo.class);

        return new PaginationResult<UserInfo>(query, page, maxResult, maxNavigationPage);
    }







}