package filesprocessing.sectionhandler.filters.propertyfilters;

import filesprocessing.sectionhandler.InvalidSubSectionLineException;
import filesprocessing.sectionhandler.filters.Filter;

import java.io.File;

/**
 * Filter class of type Hidden - checks if a certain file is hidden.
 */
public class HiddenFilter extends FilePropertyFilter {

    /**
     * Constructor
     *
     * @param decoratedFilter    the filter that is being wrapped by this filter
     * @param shouldPropertyBeOn the filter parameter
     * @throws InvalidSubSectionLineException case - indicates wrong parameters per sub-section
     */
    public HiddenFilter(Filter decoratedFilter, String shouldPropertyBeOn) throws InvalidSubSectionLineException {
        super(decoratedFilter, shouldPropertyBeOn);
    }

    @Override
    public boolean filter(File file) {
        return super.filter(file) && filterLogic(file.isHidden());
    }
}
