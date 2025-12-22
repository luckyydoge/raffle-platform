package xyz.rabbitdog.raffleplatform.domain.strategy.model.valobj;

public record SimpleRange (Integer start, Integer end) {
    public SimpleRange {
        if (start > end) {
            throw new IllegalArgumentException("区间结尾小于开始");
        }
    }

    public boolean contains(Integer x) {
        return x >= start && x < end;
    }
}
