package com.unice.i3s.servlet;

import org.apache.log4j.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by mystelven on 13/06/2015.
 */
@Named("GpgServlet")
@ApplicationScoped
public class GpgServlet extends HttpServlet {

    @javax.ws.rs.core.Context
    ServletContext context;

    public static String getName() {
        return "GpgKey";
    }

    protected Logger log() { return Logger.getLogger(this.getClass().getSimpleName()); }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        log().info("doGet() -- IN");

        PrintWriter writer = null;

        try {
            writer = response.getWriter();

            writer.write("-----BEGIN PGP PUBLIC KEY BLOCK-----\n" +
                    "Comment: Public Key of Valentin Montmirail\n" +
                    "Comment: Emails possible :\n" +
                    "Comment:   * valentin.montmirail@gmail.com\n"+
                    "Comment:   * valentin.montmirail@cril.fr\n" +
                    "Comment:   * montmirail@cril.fr\n" +
                    "\n" +
                    "mQINBFWv2aIBEACz4qHl6gW/7663JlE1gVNdkK7ejZc8VOUjoyWpMWciix+3Pgy/\n" +
                    "I9C2+k8RBcJ7GDaSyA3693GUSiKCxkn32U42+v8lXjVPan0fw/xxJe0F8czVhjCB\n" +
                    "2z2rA1DklAAik6kFLgo6sqAuIA+5s+brEWlb96NP4sFiohtE2/LcFkpFmrKDbai5\n" +
                    "Uvzf8KWvY5UIQ87bZ8XTlVR3rNNcH8eBL5up1H6L5lSv1ns57OLzl99b2TAQWg9Y\n" +
                    "kotjenZAiOKhYKQs+G2gScfnyt7WDWtsCOuXI/BMeVuA3FWFv6xuFx//s7ISC+R1\n" +
                    "hfeadduXOmC8mSwgGrYbhnpxRBejugcoZYuZbwYlcF+kMUa09qwWlgjqAVae1UL8\n" +
                    "mhexE4f8tnnlTchKG+n2PQtqc21kLPRHgF4pJqERiAMeCN1+wsoinEXkNrgeANlk\n" +
                    "QelorvoclirTIjfdOLwguajpN8x3koFYANHul7p0QR+8czQEPwSYdDfHhQi0M4To\n" +
                    "CG5eJIUWJYvYhCWvj+Y2BTRLNWqVRgBa6ryxGyS+8WfU4qX/rk7XOuuYQvPggwtf\n" +
                    "vgZd2K+XVZXjoxd+9wNbro/eLfcOL1MjSruM1TMA2Tg5e9pn4mKID/lDL5XMAayJ\n" +
                    "FO8aSMvOKowiWT7oUFQPXW++SZ0qtw5Z9UZ+CKcpBOb0fXnz8B9MFcEVoQARAQAB\n" +
                    "tDNWYWxlbnRpbiBNb250bWlyYWlsIDx2YWxlbnRpbi5tb250bWlyYWlsQGdtYWls\n" +
                    "LmNvbT6JAj0EEwEKACcFAlWv2aICGwMFCQeGH4AFCwkIBwMFFQoJCAsFFgIDAQAC\n" +
                    "HgECF4AACgkQOBWlMn1LyEehOw/9HiOp5LzamoA6D0g1RjhSG02CzcyZhL+Iy8k9\n" +
                    "yD3rHOmUQwKpY5yXyvjIGtQU53BlzxYJsSLEW+chrydsN2OVltwVJBm56qf11GNQ\n" +
                    "+m1YAlF1JWSXmrEK/sgwWqUfkGujZX3aWm2AjUzi4y9TIS2gw6eB8TblkzJax/6U\n" +
                    "n1/JH885PzSnxbMQMkgrLbYGDSPq76RSNOgRgOIBe1Vc2fbOYg6te0+HXkPxK+vG\n" +
                    "FuxfUXAhdKsuXMZJveUOdmvoxTnphLpz3sF0YlAfHO4jPzYTJi7nHdqa713fVhfh\n" +
                    "cP5wYpYNCTLc7pj07+8RC+Nicte7zNn0WwIsFYpr3h8hOa4n87ZpndgxpoFswKnf\n" +
                    "PnBrNnjwB6PCTT6KWcMEt/GBVS3p+F70ZFMiQ/fjSWyYuvhJvf2l6+OrcHVtoAdV\n" +
                    "gazvfkTttqM4x2Pwq2S787GYBLisf2LB9bfMcgVPmNJ4A+DjCVdcwofWhEtxLE8l\n" +
                    "Xl1MnFUcKGm9CQGPj5elai+n7EXu1+G5NHcfVRNQVTMZiH8D5smk/bFEyRmBY87c\n" +
                    "ZtxX236GFiuAY653G8HSU/WDqFRgNmPbkph/5BNb27uh4YdVvwUO5/1B83CG0LqA\n" +
                    "IdjE9duUSt3rOhkm8xZJNpiAwLGasMUNG55YXC7DOpOpky9K4aThTdQK6tGK8/Xt\n" +
                    "C5QgCYC5Ag0EVa/ZogEQALFhe6NgI+I0TPqv82ls2ylILnvsymTDE1wwyKPsBr8V\n" +
                    "Jz8Y6nrHYO/CnAqbyNXl0TjJRWqNF8bUd354xOkcZn29qvsdp5l34Oyi453fAk6k\n" +
                    "UL9bD4YWi0NtVX0wgJ132uc16ntGNDVzayf9sfkhRGRR2b+IOzFIco2uUZTMLKQb\n" +
                    "gtxudFERW7rgaEt0aQDAQi16qwGn9Jx4Q7QEMxiZdTHYD3sW+bOJ0TxunNI+5j51\n" +
                    "o10oPp5r9Fk8AgKanzG7Rae5PAnR0zMYEJQpYU9x9RalaGU57ZRtkHU6R87nm5iY\n" +
                    "luEaVug2vR2ajXq1eE1amFbLUuYbTX4m2UNyo3vy3RZpcEnQtBgGjBco911qvklL\n" +
                    "j3rybtvzex4KIEeuQUsETpdauDScfF6cNREtWjn1Fh5AnkUx5Zu2xcwV+lmVydjP\n" +
                    "9aJFD6HXa6+iKZBAkeDW5V9XS+vNngpAXdcJtHcrg3+2GrsqNO2RA306BUn5kZpF\n" +
                    "UTM3Cbe5lugUzuCFa1nQfo1bXRHyFPSCQyDuEcW0JkCBRH2/DblnEEW5JTh27hxC\n" +
                    "org+z0PlyQ0HoF/6rJ1bVzXjKE9r7z7w78NaZaZiT6pC/zRxBDZoNqdUHxbNJKem\n" +
                    "0a+P1YFtcNpz+vkfuBaFDxcqrIWAIDabeUNMOpWb5a/rSPPf/svnJ72PyCOJNLB7\n" +
                    "ABEBAAGJAiUEGAEKAA8FAlWv2aICGwwFCQeGH4AACgkQOBWlMn1LyEdzAg//bCrr\n" +
                    "Dvm5D9FM8TWdvOuAnx1zZbsgbihTO9ZDkuJLfpxProB3F8q276ZRF9cmj80RzgRE\n" +
                    "tiYUEkiv4gocwm+vdxEfubtaUM/FrG/9mr2buBybr0IizNIhBVnT0TRQtpYPE0CW\n" +
                    "6EMXN7KEbpCMYmlgkDKxyCmrdteCLtiKe1PYbywxwh6AfeelzeaqnWQcfuI4loGk\n" +
                    "6XJSiBKkpfdpjJBM7CWKYL59IfwXetszCVSzYWoECWy5rElQ3c0082AyRyZOQEhC\n" +
                    "w2sjTCFEhGILGoJAx6eGs4jD0RbPqaUNlBnCE2LWcH3sFN8vurLCG8cP2bdVQGgK\n" +
                    "iSVD7/nGpyAMKurkmLFrL6U8+ZeAZ2Qscx022++mERUNFhMGYz8T6g8saPlQrQzY\n" +
                    "fWdc1rb2rcpLWzaR3GDK4j5t1wEaMiDFMi5eceTsN5yvcy/TuBHAmLkkiuHr54Ic\n" +
                    "U2AzJbhVN++0q4lMa5ntmPYVUXoo3RmCncB6yanb0DjROGJrkNZgfBC+y7ZntdPA\n" +
                    "ZwDhp+2zo7HSgTW46uyiQPf7iQLwLwnBuqqP19e8pmU6fE2Zu+/THsCJP+n0W60V\n" +
                    "fVmdGxJu6HHS2vA+Y6u+c65VKS8dqngWcmBACQpSgbveDNydyhxW2XqrNDI9YKG7\n" +
                    "pW4KeenW23FXWslRBHjBPugRn70TmOM8cbLqHs4=\n" +
                    "=C3dg\n" +
                    "-----END PGP PUBLIC KEY BLOCK-----");

        } catch (IOException e) {
            log().error(e.getMessage());
        }

        log().info("doGet() -- OUT");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        doGet(request,response);
    }
}
