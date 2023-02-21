package topy.object;

import lombok.Setter;

public class Bag {
    private Long amount;
    private Invitation invitation;
    @Setter
    private Ticket ticket;

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    // 초대 받지 않은 사람들의 가방
    public Bag(long amount) {
        this(null, amount);
    }

    // 초대 받은 사람들의 가방
    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }
}
