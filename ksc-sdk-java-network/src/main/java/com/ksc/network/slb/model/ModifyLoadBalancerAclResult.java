package com.ksc.network.slb.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of ModifyLoadBalancerAcl.
 * </p>
 */
@Data
public class ModifyLoadBalancerAclResult implements Serializable, Cloneable {

    private String RequestId;
    private LoadBalancerAcl LoadBalancerAcl;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyLoadBalancerAclResult that = (ModifyLoadBalancerAclResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (LoadBalancerAcl != null ? !LoadBalancerAcl.equals(that.LoadBalancerAcl) : that.LoadBalancerAcl != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (LoadBalancerAcl != null ? LoadBalancerAcl.hashCode() : 0);
        return result;
    }


    @Override
    public ModifyLoadBalancerAclResult clone() {
        try {
            return (ModifyLoadBalancerAclResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
